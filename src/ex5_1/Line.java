package ex5_1;

public class Line {
    // Hai điểm tạo nên đường thẳng
    private Point begin;    // điểm đầu
    private Point end;      // điểm cuối

    // Constructor 1: nhận sẵn hai đối tượng Point
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor 2: nhận tọa độ x,y của hai điểm
    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    // Hiển thị thông tin đường thẳng
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    // Getter cho begin và end
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    // Setter cho begin và end
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Getter cho tọa độ của begin
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    // Getter cho tọa độ của end
    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setter cho từng tọa độ của begin
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Setter cho từng tọa độ của end
    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Tính độ dài của đoạn thẳng
    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Tính góc nghiêng (gradient) theo radian
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
