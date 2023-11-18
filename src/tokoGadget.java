
/*
Nama = Galih Panji Hanindito
NIM = V3421048
Kelas = TIB
*/

//Disini adalah Program utama dari toko untuk pembelian gadget

//import packages
import abstrak.*;
import interfaces.*;
import java.util.Scanner;

//class driver
//class declaration
public class tokoGadget {

    //Scanner
    static Scanner data = new Scanner(System.in);
    public static void main(String [] args){

        //insialisasi

            //Proses Sistem
            String hpYangDibeli = " ";
            double hargaBeliHP = 0;
            double totalHarga = 0, nominalBayar, kembalian;
            int pilihanAkhir;
            int jumlahPembelian = 0;
            int i, kodeHPdibeli, nomorBeli = 0;
            int jumlahTransaksi =0;
            char konfirmasi;

            pilihHP advan = new hpAdvan();
            pilihHP asus = new hpAsus();
            pilihHP oppo = new hpOppo();
            pilihHP realme = new hpRealme();
            pilihHP xiaomi = new hpXiaomi();

            beliBanyak beliBanyak = new beliBanyak();
            beliDoang beliDoang = new beliDoang();

            //pemanggilan Object
            gadgetInfo obj = new gadgetInfo();
        
        //Main Program COde
        do {
            //Daftar Barang
                System.out.println("| No| Merek\t| jenis\t\t| Kode\t| Harga\t\t|");
                System.out.println("|_______________________________________________________|");
                System.out.println("| 1| "+gadgetInfo.getmerek_hp()[1]+"\t| "+gadgetInfo.getjenis_hp()[1]+"\t| "+gadgetInfo.getkode_barang()[1]+"\t| "+gadgetInfo.getharga()[1]+"\t|");
                System.out.println("| 2| "+gadgetInfo.getmerek_hp()[2]+"\t| "+gadgetInfo.getjenis_hp()[2]+"\t| "+gadgetInfo.getkode_barang()[2]+"\t| "+gadgetInfo.getharga()[2]+"\t|");
                System.out.println("| 3| "+gadgetInfo.getmerek_hp()[3]+"\t| "+gadgetInfo.getjenis_hp()[3]+"\t| "+gadgetInfo.getkode_barang()[3]+"\t| "+gadgetInfo.getharga()[3]+"\t|");
                System.out.println("| 4| "+gadgetInfo.getmerek_hp()[4]+"\t| "+gadgetInfo.getjenis_hp()[4]+"\t| "+gadgetInfo.getkode_barang()[4]+"\t| "+gadgetInfo.getharga()[4]+"\t|");
                System.out.println("| 5| "+gadgetInfo.getmerek_hp()[5]+"\t| "+gadgetInfo.getjenis_hp()[5]+"\t| "+gadgetInfo.getkode_barang()[5]+"\t| "+gadgetInfo.getharga()[5]+"\t|");
                System.out.println("|_______________________________________________________|");
                System.out.println();

            //Program Pemesanan
                i=0;
                do {
                    // Input Kode HP yang ingn dibeli
                        System.out.print("Kode HP Yang ingin dibeli = ");
                        kodeHPdibeli = data.nextInt();
                        data.nextLine();
                        if (kodeHPdibeli >=1 && kodeHPdibeli <= 5) {
                            if (kodeHPdibeli==1) {
                                System.out.println("Anda Memilih "+advan.getHP());
                            } else if (kodeHPdibeli==2) {
                                System.out.println("Anda Memilih "+asus.getHP());
                            } else if (kodeHPdibeli==3) { 
                                System.out.println("Anda Memilih "+oppo.getHP());
                            } else if (kodeHPdibeli==4) {
                                System.out.println("Anda Memilih "+realme.getHP());
                            } else if (kodeHPdibeli==5) { 
                                System.out.println("Anda Memilih "+xiaomi.getHP());
                            }
                            System.out.print("Jumlah HP Yang Dibeli = ");
                            jumlahPembelian = data.nextInt();
                            data.nextLine();

                            // Proses Hitung Transaksi
                            hpYangDibeli = gadgetInfo.getmerek_hp()[kodeHPdibeli]+gadgetInfo.getjenis_hp()[kodeHPdibeli];
                            hargaBeliHP = gadgetInfo.getharga()[kodeHPdibeli];
                            totalHarga = totalHarga + (hargaBeliHP * jumlahPembelian);
                            jumlahTransaksi++;

                        } else {
                            System.out.println("Maaf Kode HP Salah!");
                        }

                        // Konfirmasi
                        System.out.println("=================================");
                        System.out.print("Beli lagi? (Y/T) = ");
                        konfirmasi = data.next().charAt(0);
                        data.nextLine();
                        i++;
                    } while (konfirmasi == 'y' || konfirmasi == 'Y' );
                    
                    // Cetak Struk
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("====================================");
                        System.out.println("=========== TOKO GADGETin ==========");
                        System.out.println("====================================");

                        //Cetak Nomor Pembelian
                            nomorBeli =nomorBeli+1; 
                            System.out.println("Kode Pembelian : "+nomorBeli);

                        //Perhitungan Total
                        for (i = 0; i < jumlahTransaksi; i++) {
                            if (hpYangDibeli != null && hargaBeliHP != 0 && jumlahPembelian != 0) {
                                System.out.println(hpYangDibeli + " : Rp" + hargaBeliHP + " x " + jumlahPembelian + " = Rp"
                                        + (hargaBeliHP * jumlahPembelian));
                            }
                        }
                            System.out.println("Total : Rp" + totalHarga);

                    // Sistem Pembayaran
                        System.out.println("====================================");
                        System.out.print("Uang Anda : Rp. ");
                        nominalBayar = data.nextDouble();
                        data.nextLine();
                        if (nominalBayar < totalHarga) {
                            System.out.println("====================================");
                            System.out.println("Maaf uang Anda kurang!");
                        } else {
                            kembalian = nominalBayar - totalHarga;
                            System.out.println("Kembalian : Rp" + kembalian);
                        }
                        System.out.println(" ");
                        if (totalHarga > 5000000) {
                            System.out.println(beliBanyak.terimaKasih());
                        } else {
                            System.out.println(beliDoang.terimaKasih());
                        }

        // Program Kembali ke Main Menu atau Shutdown
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("====================================");
            System.out.println("=========== TOKO GADGETin ==========");
            System.out.println("====================================");
            System.out.println("1. Beli HP/Main Menu");
            System.out.println("2. Shutdown");
            System.out.print("Input : ");
            pilihanAkhir = data.nextInt();
            obj.getCek();

            System.out.println(" ");
            System.out.println(" ");
        //program Exit 
        } while ( pilihanAkhir == 1 );
        shutdownsystem();
        
    }

    public static void shutdownsystem () {
        for(int bintang=0; bintang <= 20; bintang++){
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println("Preparing to Shutdown");
        System.out.println("======================");
        System.out.println("System is Shuting down");
        System.exit(0);
    }//end method shutdown

}


