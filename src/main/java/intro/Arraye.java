package intro;

public class Arraye {
  public static void main(String[] args) {
    //    int[] data1; // deklarasi
    //    int[] data2, key1, values1; // deklarasi lebih dari 1
    //    int data3[]; // like C programming
    //    int data4[],
    //        key2[],
    //        values2; // not recommended because values2 still on primitive type not array
    //    String[][] arrayDuaDimensi; // jumlah kurung kotak menentukan dimensi array
    //    String[][][] arrayTigaDimensi;
    //
    //    // array primitif inisialisasi
    //    int[] data5;
    //    data5 = new data5[10];
    //    System.out.println(data5);
    //
    //    // array wrapper class atau object
    //    String[] data6;
    //    data6 = new String[10];
    //
    //    String[][] arrayDuaDimensi1 = new String[10][10];
    //    String[] arrayDuaDimensi2 = new String[10];
    //
    //    // input value to array
    //    int data6 = new int[4];
    //    data6[0] = 10;
    //    data6[1] = 8;
    //    data6[3] = 9;

    //    Integer[][] data = new Integer[3][3];
    //    data[0][0] = 1;
    //    data[0][1] = 1;
    //    data[0][2] = 1;
    //    data[1][0] = 1;

    //    int[][] data = new int[3][];
    //    data[0] = new int[5]; // init array yang dimaksukan ke array dimensi pertama
    //    data[0][0] = 10;
    //    data[0][2] = 10;
    //    data[0][3] = 10;
    //
    //    data[1] = new int[2]; // init array yang dimaksukan ke array dimensi pertama
    //    data[1][0] = 100;
    //    data[1][1] = 200;

    int[] data = {1, 2, 3, 4, 6};
    int[][] duaDimensi = {{1, 2, 3}, {2, 3}, {3}};
    String[][] arrayDuaDimesi = {{"satu", "dua", "tiga"}, {"empat", "lima"}};

    int[] data2 = new int[] {1, 2, 3, 4, 60};
    int[][] duaDimensi2 =
        new int[][] {
          {
            1, 2, 3, 4,
          },
          {2, 3},
          {3}
        };
    String[][] arrayDuaDimensi = new String[][] {{"satu", "dua", "tiga"}, {"empat", "lima"}};
  }
}
