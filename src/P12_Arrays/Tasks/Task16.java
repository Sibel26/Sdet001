package P12_Arrays.Tasks;

public class Task16 {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int crpm=1;//arr elemanların çarpımı için boş kutu 1 ile  tanımlandı
        for (int kat = 0; kat < arr.length; kat++) {

                crpm*=arr[kat][arr[kat].length-1];
            }

        System.out.println("arr elemanların çarpımı: "+crpm);//10->5*1*2
    }
}
