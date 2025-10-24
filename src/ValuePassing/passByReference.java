package ValuePassing;

public class passByReference {

    public static void main(String[] args) {
        point first = new point(3,4);
        System.out.println(first); // before change
        move(first);
        System.out.println(first); // after change
    }

    public static void move(point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class point{
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }



}
