#include <ESP8266WiFi.h>
#include <ESP8266WiFiMulti.h>
#include <WiFiUdp.h>

#include <Adafruit_GFX.h>
#include <Adafruit_NeoPixel.h>

#define PIN             D1
#define MATRIX_WIDTH    28
#define MATRIX_HEIGHT   5

#define SSID            "board"
#define PASS            "s!ck_passw0rd"
#define PORT            1337



Adafruit_NeoPixel pixels = Adafruit_NeoPixel(MATRIX_WIDTH * MATRIX_HEIGHT, PIN, NEO_GRB + NEO_KHZ800);

int status = WL_IDLE_STATUS;

WiFiUDP Udp;

void connectToWifi() {
    WiFi.mode(WIFI_STA);
    WiFi.begin("SSID", "s3cr3t");

    Serial.println();
    Serial.println();
    Serial.print("Wait for WiFi... ");
    
    while (WiFi.status() != WL_CONNECTED) {
      delay(500);
      Serial.print(".");
    }

    
    Serial.println("");
    Serial.println("WiFi connected!");
    Serial.println("IP address: ");
    Serial.println(WiFi.localIP());
  
}

void createAP() {
  Serial.print("Configuring access point...");
  WiFi.softAP(SSID , PASS);
  Serial.println("IP address: ");
  Serial.println(WiFi.softAPIP());
}

void setup() {
  Serial.begin(115200);
  Serial.println("");

  //createAP();
  connectToWifi();
    
  Serial.print("Initializing udp connection ...");
  Udp.begin(PORT);
 
  Serial.print("Initializing matrix ...");
  pixels.begin();
}

uint8_t image[MATRIX_HEIGHT * MATRIX_WIDTH * 3];

void loop() {
  int packetSize = Udp.parsePacket();
  if (packetSize)
  {
    int maxSize = MATRIX_HEIGHT * MATRIX_WIDTH * 3;
    int len = Udp.read(image,maxSize);
    for(int i=len;i < maxSize; i++)
    {
      image[i] = 0;
    }
    pixels.clear();
    
    for(int j=0;j<MATRIX_HEIGHT;j++){
      for(int i=0;i<MATRIX_WIDTH;i++){
        int offset = ((j * MATRIX_WIDTH) + (MATRIX_WIDTH - i - 1))*3;
        int x;
        if (j % 2 == 0) {
          x = i;
        } else {
          x = MATRIX_WIDTH - i - 1;
        }
        pixels.setPixelColor((j * MATRIX_WIDTH) + x, pixels.Color(image[offset + 0], image[offset + 1], image[offset + 2]));
      }
    }
    pixels.show();
  }
}
