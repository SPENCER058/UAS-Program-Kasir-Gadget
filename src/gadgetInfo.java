/*
Nama = Galih Panji Hanindito
NIM = V3421048
Kelas = TIB
*/

//Disini adalah object dari barang-barang yang akan ditampilkan di driver

public class gadgetInfo extends database {

    //constructor
    public gadgetInfo() {
        //merek
        gadgetInfo.merek_hp[1] = "Advan";
        gadgetInfo.merek_hp[2] = "Asus";
        gadgetInfo.merek_hp[3] = "Oppo";
        gadgetInfo.merek_hp[4] = "Realme";
        gadgetInfo.merek_hp[5] = "Xiaomi";

        //Jenis
        gadgetInfo.jenis_hp[1] = "G9 Pro";
        gadgetInfo.jenis_hp[2] = "ROG 5 Ult";
        gadgetInfo.jenis_hp[3] = "Reno 7";
        gadgetInfo.jenis_hp[4] = "Narzo 50a";
        gadgetInfo.jenis_hp[5] = "Black Shark 4";

        //kode barang
        gadgetInfo.kode_barang[1] = 1;
        gadgetInfo.kode_barang[2] = 2;
        gadgetInfo.kode_barang[3] = 3;
        gadgetInfo.kode_barang[4] = 4;
        gadgetInfo.kode_barang[5] = 5;

        //harga
        gadgetInfo.harga[1] = 9140000;
        gadgetInfo.harga[2] = 9140000;
        gadgetInfo.harga[3] = 9140000;
        gadgetInfo.harga[4] = 9140000;
        gadgetInfo.harga[5] = 9140000;

    }

    //methods mutator
    public void setmerek_hp(String[] merek_hp){
        gadgetInfo.merek_hp = merek_hp;
    }

    public void setjenis_hp(String[] jenis_hp){
        gadgetInfo.jenis_hp = jenis_hp;
    }
    
    public void setkode_barang(int[] kode_barang){
        gadgetInfo.kode_barang = kode_barang;
    }

    public void setharga(int[] harga){
        gadgetInfo.harga = harga;
    }

    public void setCek(String cek){
        gadgetInfo.cek = cek;
    }

    public String getCek(){
        return cek;
    }

    //method assesor
    public static String[] getmerek_hp(){
        return merek_hp;
    }

    public static String[] getjenis_hp(){
        return jenis_hp;
    }

    public static int[] getkode_barang(){
        return kode_barang;
    }
    
    public static int[] getharga(){
        return harga;
    }  
}
