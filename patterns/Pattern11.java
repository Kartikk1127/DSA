package patterns;

class Pattern11 {
    public void pattern11(int n) {
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                start = 1;
                printPattern(i,start);
            }
            else {
                start = 0;
                printPattern(i,start);
            }
        }
    }
    public void printPattern(int i, int start) {
        while(i+1>0) {
            System.out.print(start + " ");
            if(start==1) start = 0; else start = 1;
            i--;
        }
        System.out.println();
    }
}