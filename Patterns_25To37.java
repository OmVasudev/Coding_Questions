public class Patterns_25To37 {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(3);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(19,3);
        // pattern8(3);
        // pattern9(4);
        // pattern10(19, 3);
        // pattern11(5);
        // pattern12(5, 4);
        // pattern13(9, 11);
        pattern14(9, 11);

    }

    // 1
    // 2 3
    // 4 5 6 7
    // 8 9 10 11
    
    public static void pattern1(int n){
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }

    // 26.
    // 1 2 3
    // 4 5 6
    // 7 8 9
    
    public static void pattern2(int n){
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }

    // 27.
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    

    // 28.
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

     // 29.
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 30.
    // 1
    // 1 2 1
    // 1 2 3 2 1
    // 1 2 3 4 3 2 1
    // 1 2 3 4 5 4 3 2 1
    
    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=i-1 ; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    // 31.
    // 19 38 57
    // 76 95 114
    // 133 152 171
    
    public static void pattern7(int num,int n){
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((num*k++)+" ");
            }
            System.out.println();
        }
    }

    // 32.
    // A B C
    // D E F
    // G H I
    public static void pattern8(int n){
        int k = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)k+++" ");
            }
            System.out.println();
        }
    }

    // 33.
    // 1 1
    // 1 2 2 1
    // 1 2 3 3 2 1
    // 1 2 3 4 4 3 2 1
    

    public static void pattern9(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=i ; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    // 34.
    // 19 0 0
    // 0 19 0
    // 0 0 19

    public static void pattern10(int num,int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j)
                    System.out.print(num+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }

    }


    // 35.
    // * * * * * * * * *
    //         *
    //         *
    //         *
    //         *
    //         *
    // * * * * * * * * *
    
    public static void pattern11(int n){
        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int j=1; j<=n; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=1; j<=n/2+1; j++){
                    if(j == n/2+1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }


    // 36.
    // @ @ @ @
    // @     @
    // @ @ @ @
    // @     @
    // @     @

    public static void pattern12(int row,int col){
        for(int i=1; i<=row/2+1; i++){
            for(int j=1; j<=col ;j++){
                if(i==1 || i==row/2+1){
                    System.out.print("@ ");
                }
                else{
                    if(j!=1 && j!=col){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("@ ");
                    }
                }
            }
            System.out.println();
        }
        for(int i=1; i<=row/2; i++){
            for(int j=1; j<=col; j++){
                if(j!=1 && j!=col){
                    System.out.print("  ");
                }
                else{
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }

    }

    // 37.
    //   * * * * * *         *
    //             *         *
    //             *         *
    //             *         *
    //   * * * * * * * * * * *
    //   *         *
    //   *         *
    //   *         *
    //   *         * * * * * * 
    
    public static void pattern13(int row,int col){
        for(int i=1; i<=row; i++){
            if(i==row/2+1)
                for(int j=1;j<=col;j++)
                    System.out.print("* ");
            else if(i==1){
                for(int j=1; j<=col;j++)
                    if(j<=col/2+1 || j==col)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            else if(i==row){
                for(int j=1; j<=col;j++)
                    if(j>=col/2+1 || j==1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            else{
                for(int j=1 ;j<=col; j++){
                    if(j == col/2+1)
                        System.out.print("* ");
                    else if(i<=row/2 && j==col)
                        System.out.print("* ");
                    else if(i>row/2+1 && j==1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

    // 

    //    *         * * * * * *         
    //    *         *         
    //    *         *         
    //    *         *         
    //    * * * * * * * * * * *
    //              *         *
    //              *         *
    //              *         *
    //    * * * * * *         *

    public static void pattern14(int row,int col){
        for(int i=1; i<=row; i++){
            if(i==row/2+1)
                for(int j=1;j<=col;j++)
                    System.out.print("* ");
            else if(i==1){
                for(int j=1; j<=col;j++)
                    if(j>=col/2+1 || j==1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            else if(i==row){
                for(int j=1; j<=col;j++)
                    if(j<=col/2+1 || j==col)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            else{
                for(int j=1 ;j<=col; j++){
                    if(j == col/2+1)
                        System.out.print("* ");
                    else if(i<=row/2 && j==1)
                        System.out.print("* ");
                    else if(i>row/2+1 && j==col)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

}
    


