public class CheckTriangle {
    int side1;
    int side2;
    int side3;

    public CheckTriangle() {
    }

    public CheckTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String checkTriangle() {
        String result = "";
        if (this.side3 <= 0 || this.side2 <= 0 || this.side1 <= 0) {
            result = "0";
        } else {
            if (this.side1 == this.side2 && this.side1 == this.side3) {
                result = "1";
            } else if (this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
                result = "2";
            } else if (this.side1 + this.side2 > this.side3 && this.side1 + this.side3 > this.side2 && this.side3 + this.side2 > this.side1) {
                result = "3";
            } else {
                result = "0";
            }
        }

        return result;
    }
}
