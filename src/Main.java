public class Main {
    public static void main(String[] args) {
        double [] cxtn = {5.6 , 4.2, 9.5, -3.6, 5.3, -7.2, 9.1, -4.9, 4.8, 2.5, 7.2, 2.9, 6.8, 6.3, 5.1};
        double sum = 0.0;
        int col = 0;
        boolean examination = false;
        for ( double foreach : cxtn ) {
            if (foreach < 0) {
                examination = true;
            }
            else if (foreach > 0 && examination){
                sum += foreach;
                col ++;
                System.out.println(foreach);
            }
        }
        System.out.println("арифметическое число " + sum/col);
    }
}