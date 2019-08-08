package at.nwork;

import java.util.ArrayList;

public enum BasicFont {
    LETTER_A(new boolean[][] { { false, true, true, false }, { true, false, false, true }, { true, true, true, true },
            { true, false, false, true }, { true, false, false, true }, }),
    LETTER_B(new boolean[][] { { true, true, true, false }, { true, false, false, true }, { true, true, true, false },
            { true, false, false, true }, { true, true, true, false }, }),
    LETTER_C(new boolean[][] { { true, true, true, true }, { true, false, false, false }, { true, false, false, false },
            { true, false, false, false }, { true, true, true, true }, }),
    LETTER_D(new boolean[][] { { true, true, true, false }, { true, false, false, true }, { true, false, false, true },
            { true, false, false, true }, { true, true, true, false }, }),
    LETTER_E(new boolean[][] { { true, true, true, true }, { true, false, false, false }, { true, true, true, false },
            { true, false, false, false }, { true, true, true, true }, }),
    LETTER_F(new boolean[][] { { true, true, true, true }, { true, false, false, false }, { true, true, true, false },
            { true, false, false, false }, { true, false, false, false }, }),
    LETTER_G(new boolean[][] { { true, true, true, true }, { true, false, false, false }, { true, false, true, true },
            { true, false, false, true }, { true, true, true, true }, }),
    LETTER_H(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, true, true, true },
            { true, false, false, true }, { true, false, false, true }, }),
    LETTER_I(new boolean[][] { { true }, { true }, { true }, { true }, { true }, }),
    LETTER_J(new boolean[][] { { false, false, true, false }, { false, false, true, false },
            { false, false, true, false }, { true, false, true, false }, { true, true, true, false }, }),
    LETTER_K(new boolean[][] { { true, false, false, true }, { true, false, true, true }, { true, true, true, false },
            { true, false, true, true }, { true, false, false, true }, }),
    LETTER_L(new boolean[][] { { true, false, false, false }, { true, false, false, false },
            { true, false, false, false }, { true, false, false, false }, { true, true, true, true }, }),
    LETTER_M(new boolean[][] { { true, false, false, true }, { true, true, true, true }, { true, false, false, true },
            { true, false, false, true }, { true, false, false, true }, }),
    LETTER_N(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, true, false, true },
            { true, false, true, true }, { true, false, false, true }, }),
    LETTER_O(new boolean[][] { { true, true, true, true }, { true, false, false, true }, { true, false, false, true },
            { true, false, false, true }, { true, true, true, true }, }),
    LETTER_P(new boolean[][] { { true, true, true, true }, { true, false, false, true }, { true, true, true, true },
            { true, false, false, false }, { true, false, false, false }, }),
    LETTER_Q(new boolean[][] { { true, true, true, true }, { true, false, false, true }, { true, false, false, true },
            { true, false, true, false }, { true, true, false, true }, }),
    LETTER_R(new boolean[][] { { true, true, true, true }, { true, false, false, true }, { true, true, true, true },
            { true, false, true, false }, { true, false, false, true }, }),
    LETTER_S(new boolean[][] { { true, true, true, true }, { true, false, false, false }, { true, true, true, true },
            { false, false, false, true }, { true, true, true, true }, }),
    LETTER_T(new boolean[][] { { true, true, true }, { false, true, false }, { false, true, false },
            { false, true, false }, { false, true, false }, }),
    LETTER_U(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, false, false, true },
            { true, false, false, true }, { true, true, true, true }, }),
    LETTER_V(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, false, false, true },
            { true, false, false, true }, { false, true, true, false }, }),
    LETTER_W(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, false, false, true },
            { true, true, true, true }, { true, false, false, true }, }),
    LETTER_X(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { false, true, true, false },
            { true, false, false, true }, { true, false, false, true }, }),
    LETTER_Y(new boolean[][] { { true, false, false, true }, { true, false, false, true }, { true, true, true, true },
            { false, true, false, false }, { false, true, false, false }, }),
    LETTER_Z(new boolean[][] { { true, true, true, true }, { false, false, false, true }, { false, true, true, false },
            { true, false, false, false }, { true, true, true, true }, }),
    NUMBER_ONE(new boolean[][] { { false, false, true, false }, { false, true, true, false },
            { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, }),
    NUMBER_TWO(new boolean[][] { { false, true, true, false }, { true, false, false, true },
            { false, true, true, false }, { true, false, false, false }, { true, true, true, true }, }),
    NUMBER_THREE(new boolean[][] { { false, true, true, false }, { true, false, false, true },
            { false, false, true, false }, { true, false, false, true }, { false, true, true, false }, }),
    NUMBER_FOUR(new boolean[][] { { false, false, true, false }, { false, true, false, false },
            { true, false, true, false }, { true, true, true, true }, { false, false, true, false }, }),
    NUMBER_FIVE(new boolean[][] { { true, true, true, false }, { true, false, false, false },
            { true, true, true, false }, { false, false, false, true }, { true, true, true, false }, }),
    NUMBER_SIX(new boolean[][] { { false, true, true, false }, { true, false, false, false },
            { true, true, true, false }, { true, false, false, true }, { false, true, true, false }, }),
    NUMBER_SEVEN(new boolean[][] { { true, true, true, true }, { false, false, false, true },
            { false, false, true, false }, { false, true, false, false }, { true, false, false, false }, }),
    NUMBER_EIGHT(new boolean[][] { { false, true, true, false }, { true, false, false, true },
            { true, true, true, true }, { true, false, false, true }, { false, true, true, false }, }),
    NUMBER_NINE(new boolean[][] { { false, true, true, false }, { true, false, false, true },
            { true, true, true, true }, { false, false, false, true }, { false, true, true, false }, }),
    NUMBER_ZERO(new boolean[][] { { false, true, true, false }, { true, false, false, true },
            { true, false, false, true }, { true, false, false, true }, { false, true, true, false }, }),
    SPECIAL_EX_MARK(new boolean[][] { { true }, { true }, { true }, { false }, { true }, }),
    SPECIAL_QU_MARK(new boolean[][] { { true, true, true, true }, { false, false, false, true },
            { false, true, true, false }, { true, false, false, false }, { true, true, true, true }, }),
    SPECIAL_COLON(new boolean[][] { { false }, { true }, { false }, { true }, { false }, }),
    SPECIAL_DOT(new boolean[][] { { false }, { false }, { false }, { false }, { true }, }),
    SPACE(new boolean[][] { { false, false, false, false }, { false, false, false, false },
            { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, });

    private boolean[][] pixels;
    private static Color fontColor = new Color(255, 255, 255);

    BasicFont(boolean[][] pixels) {

        this.pixels = pixels;
    }

    public static Color getFontColor() {
        return fontColor;
    }

    public static void setFontColor(Color fontColor) {
        BasicFont.fontColor = fontColor;
    }

    public static BasicFont[] createText(String text) {
        BasicFont[] returnValue = new BasicFont[text.length()];
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
            case 'a':
            case 'A':
                returnValue[i] = LETTER_A;
                break;
            case 'b':
            case 'B':
                returnValue[i] = LETTER_B;
                break;
            case 'c':
            case 'C':
                returnValue[i] = LETTER_C;
                break;
            case 'd':
            case 'D':
                returnValue[i] = LETTER_D;
                break;
            case 'e':
            case 'E':
                returnValue[i] = LETTER_E;
                break;
            case 'f':
            case 'F':
                returnValue[i] = LETTER_F;
                break;
            case 'g':
            case 'G':
                returnValue[i] = LETTER_G;
                break;
            case 'h':
            case 'H':
                returnValue[i] = LETTER_H;
                break;
            case 'i':
            case 'I':
                returnValue[i] = LETTER_I;
                break;
            case 'j':
            case 'J':
                returnValue[i] = LETTER_J;
                break;
            case 'k':
            case 'K':
                returnValue[i] = LETTER_K;
                break;
            case 'l':
            case 'L':
                returnValue[i] = LETTER_L;
                break;
            case 'm':
            case 'M':
                returnValue[i] = LETTER_M;
                break;
            case 'n':
            case 'N':
                returnValue[i] = LETTER_N;
                break;
            case 'o':
            case 'O':
                returnValue[i] = LETTER_O;
                break;
            case 'p':
            case 'P':
                returnValue[i] = LETTER_P;
                break;
            case 'q':
            case 'Q':
                returnValue[i] = LETTER_Q;
                break;
            case 'r':
            case 'R':
                returnValue[i] = LETTER_R;
                break;
            case 's':
            case 'S':
                returnValue[i] = LETTER_S;
                break;
            case 't':
            case 'T':
                returnValue[i] = LETTER_T;
                break;
            case 'u':
            case 'U':
                returnValue[i] = LETTER_U;
                break;
            case 'v':
            case 'V':
                returnValue[i] = LETTER_V;
                break;
            case 'w':
            case 'W':
                returnValue[i] = LETTER_W;
                break;
            case 'x':
            case 'X':
                returnValue[i] = LETTER_X;
                break;
            case 'y':
            case 'Y':
                returnValue[i] = LETTER_Y;
                break;
            case 'z':
            case 'Z':
                returnValue[i] = LETTER_Z;
                break;
            case '1':
                returnValue[i] = NUMBER_ONE;
                break;
            case '2':
                returnValue[i] = NUMBER_TWO;
                break;
            case '3':
                returnValue[i] = NUMBER_THREE;
                break;
            case '4':
                returnValue[i] = NUMBER_FOUR;
                break;
            case '5':
                returnValue[i] = NUMBER_FIVE;
                break;
            case '6':
                returnValue[i] = NUMBER_SIX;
                break;
            case '7':
                returnValue[i] = NUMBER_SEVEN;
                break;
            case '8':
                returnValue[i] = NUMBER_EIGHT;
                break;
            case '9':
                returnValue[i] = NUMBER_NINE;
                break;
            case '0':
                returnValue[i] = NUMBER_ZERO;
                break;
            case '!':
                returnValue[i] = SPECIAL_EX_MARK;
                break;
            case '?':
                returnValue[i] = SPECIAL_EX_MARK;
                break;
            case ':':
                returnValue[i] = SPECIAL_COLON;
                break;
            case '.':
                returnValue[i] = SPECIAL_DOT;
                break;
            case ' ':
                returnValue[i] = SPACE;
                break;
            default:
                throw new RuntimeException("Character not supported: " + charArray[i]);
            }
        }
        return returnValue;
    }

    public int getWidth() {
        return pixels.length > 0 ? pixels[0].length : 0;
    }

    public int getHeight() {
        return pixels.length;
    }

    public Pixel[] getPixels() {
        ArrayList<Pixel> returnValue = new ArrayList<Pixel>();
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                if (pixels[i][j]) {
                    returnValue.add(new Pixel(j, i, getFontColor()));
                }
            }
        }
        return returnValue.toArray(new Pixel[returnValue.size()]);
    }
}
