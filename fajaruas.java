/*
*	Nama	: Fajar Farhan Samosir
*	NIM		: 202013030
*	Prodi	: TIF 1B
*	Makul	: ALP
*
*/

import java.util.*;
public class fajaruas{
	public static void main (String[]args){
		System.out.println();
		System.out.println("\t\t\t\t\t                                ");
		System.out.println("\t\t\t\t\t                                ");
		System.out.println("\t\t\t\t\t_________________________________");
		System.out.println("\t\t\t\t\t              HALO              ");
		System.out.println("\t\t\t\t\t    SELAMAT DATANG DI PROGRAM   ");
		System.out.println("\t\t\t\t\t   MENGHITUNG LUAS BANGUN DATAR ");
		System.out.println("\t\t\t\t\t................................");
		System.out.println("\t\t\t\t\tPROJEK UAS ALGORITMA PEMROGRAMAN");
		System.out.println("\t\t\t\t\t................................");
		System.out.println("\t\t\t\t\t********* SILAHKAN LOGIN ********");
		System.out.println("\t\t\t\t\t_________________________________");
		System.out.println();
		login();
	}

		//bagian login
static void login(){
		String data[]={"FAJAR","202013030"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		if(username.equals(data[0])&&password.equals(data[1])){
			System.out.println();
			System.out.println("\t\t\t\t\t                             ");
			System.out.println("\t\t\t\t\t*                           *");
			System.out.println("\t\t\t\t\t  SELAMAT DATANG DI PROGRAM  ");
			System.out.println("\t\t\t\t\t    MENGHITUNG LUAS BANGUN   ");
			System.out.println("\t\t\t\t\t            DATAR            ");
			System.out.println("\t\t\t\t\t_____________________________");
			System.out.println("\t\t\t\t\t     fajar farhan. Samosir   ");
			System.out.println("\t\t\t\t\t_____________________________");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println(" MAAF PASSWORD DAN USERNAME YANG ANDA MASUKKAN SALAH");
			System.out.println("          ANDA TIDAK BISA MELAKUKAN LOGIN           ");
			System.out.println("  SILAHKAN MASUKKAN PASSWORD DAN USERNAME YANG BENAR");
			System.out.println();
			login();
		}
		}
		static void menu(){
		
		String menu_utama[]={"program luas","salam","Biodata Pemrogram","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		System.out.println("4. "+menu_utama[3]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			luas();
		}else if(menu==2){
			tambahan();
		}else if(menu==3){
			biodata();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Berhitung");
			System.out.println("Sistem Sekarang Akan keluar");
			System.out.println("Keluar Dari Sistem");
			System.exit(0);
		}


	}
	static void luas(){
		int daftar_bangun;
		String bangun_datar[]={"luas persegi","luas persegi panjang","luas segitiga","luas lingkaran","luas belah ketupat","luas seluruh bangun datar","Keluar"};
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_datar[0]);
		System.out.println("2. "+bangun_datar[1]);
		System.out.println("3. "+bangun_datar[2]);
		System.out.println("4. "+bangun_datar[3]);
		System.out.println("5. "+bangun_datar[4]);
		System.out.println("6. "+bangun_datar[5]);
		System.out.println("7. "+bangun_datar[6]);

		Scanner pilih2=new Scanner(System.in);
		int menub;
		System.out.println();
		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan luas nya : ");
		menub=pilih2.nextInt();
		switch(menub) {
			case 1 :
			System.out.println();
			System.out.println("menghitung luas persegi");
			int sisi,lp;
			Scanner inputsisi=new Scanner(System.in);
			System.out.println();
			System.out.println("masukkan sisi a : ");
			sisi=inputsisi.nextInt();
			lp=sisi*sisi;
			System.out.println("Diketahui :");
			System.out.println("sisi : "+sisi);
			System.out.println("proses/rumus = sisi  * sisi");
			System.out.println("luas persegi nya : "+lp);
			System.out.println("______________________");
			System.out.println();
			next();
			break;

			case 2 :
			System.out.println();
			System.out.println("menghitung luas persegi panjang");
			int panjang, lebar, luaspp;
			Scanner masukpanjang=new Scanner(System.in);
			System.out.println("masukkan panjang : ");
			panjang=masukpanjang.nextInt();
			Scanner lebarnya=new Scanner(System.in);
			System.out.println("masukkan lebar : ");
			lebar=lebarnya.nextInt();
			luaspp=panjang*lebar;
			System.out.println("Diketahui : ");
			System.out.println("panjang : "+panjang);
			System.out.println("lebar : "+lebar);
			System.out.println("rumus nya =panjang * lebar");
			System.out.println("luas persegi panjang anda :  "+luaspp);
			System.out.println("______________________");
			System.out.println();
			next();
			break;

			case 3 :
			System.out.println();
			System.out.println("menghitung luas segitiga");
			double alas,tinggi, luassgtg;
			Scanner masukalas=new Scanner(System.in);
			System.out.println("masukkan alas : ");
			alas=masukalas.nextDouble();
			Scanner masuktinggi=new Scanner(System.in);
			System.out.println("masukkan tinggi : ");
			tinggi=masuktinggi.nextDouble();
			luassgtg=alas*tinggi/2;
			System.out.println("Diketahui: ");
			System.out.println("alas : "+alas);
			System.out.println("tinggi : "+tinggi);
			System.out.println("rumus = 1/2*alas*tinggi");
			System.out.println("luas segitiga :  "+luassgtg);
			System.out.println("______________________");
			System.out.println();
			next();
			break;

			case 4 :
			System.out.println();
			System.out.println("menghitung luas lingkaran");
			double phi=3.14,jari, luascrcl;
			Scanner masukjari=new Scanner(System.in);
			System.out.println("masukkan jari jari : ");
			jari=masukjari.nextDouble();
			luascrcl=phi*jari*jari;
			System.out.println("Diketahui :");
			System.out.println("Phi = 3.14");
			System.out.println("jari-jari : "+jari);
			System.out.println("rumus= phi*jari^2");
			System.out.println("luas lingkaran :  "+luascrcl);
			System.out.println("______________________");
			System.out.println();
			next();
			break;

			case 5 :
			System.out.println();
			System.out.println("menghitung luas belah ketupat");
			double d1,d2, luasdmd;
			Scanner diagonal=new Scanner(System.in);
			System.out.println("masukkan diagonal 1 : ");
			d1=diagonal.nextDouble();
			System.out.println("masukkan diagonal 2 : ");
			d2=diagonal.nextDouble();
			luasdmd=d1*d2/2;
			System.out.println("Diketahui : ");
			System.out.println("diagonal 1 : "+d1);
			System.out.println("diagonal 2 : "+d2);
			System.out.println("rumus = d1*d2/2");
			System.out.println("luas belah ketupat :  "+luasdmd);
			System.out.println("______________________");
			System.out.println();
			next();
			break;

			case 6 :
			System.out.println();
			System.out.println("menghitung luas persegi");
			double sisi1,lp1;
			Scanner inputsisi1=new Scanner(System.in);
			System.out.println();
			System.out.println("masukkan sisi a : ");
			sisi1=inputsisi1.nextDouble();
			lp1=sisi1*sisi1;
			System.out.println("luas persegi nya : "+lp1);
			System.out.println("______________________");
			System.out.println();
			/////
			System.out.println();
			System.out.println("menghitung luas persegi panjang");
			double panjang1, lebar1, luaspp1;
			Scanner masukpanjang1=new Scanner(System.in);
			System.out.println("masukkan panjang : ");
			panjang1=masukpanjang1.nextDouble();
			Scanner lebarnya1=new Scanner(System.in);
			System.out.println("masukkan lebar : ");
			lebar1=lebarnya1.nextDouble();
			luaspp1=panjang1*lebar1;
			System.out.println("luas persegi panjang anda :  "+luaspp1);
			System.out.println("______________________");
			System.out.println();
			/////
			System.out.println();
			System.out.println("menghitung luas segitiga");
			double alas1,tinggi1, luassgtg1;
			Scanner masukalas1=new Scanner(System.in);
			System.out.println("masukkan alas : ");
			alas1=masukalas1.nextDouble();
			Scanner masuktinggi1=new Scanner(System.in);
			System.out.println("masukkan tinggi : ");
			tinggi1=masuktinggi1.nextDouble();
			luassgtg1=alas1*tinggi1/2;
			System.out.println("luas segitiga :  "+luassgtg1);
			System.out.println("______________________");
			System.out.println();
			/////

			System.out.println();
			System.out.println("menghitung luas lingkaran");
			double phi1=3.14,jari1, luascrcl1;
			Scanner masukjari1=new Scanner(System.in);
			System.out.println("masukkan jari jari : ");
			jari1=masukjari1.nextDouble();
			luascrcl1=phi1*jari1*jari1;
			System.out.println("luas lingkaran :  "+luascrcl1);
			System.out.println("______________________");
			System.out.println();
			/////
			System.out.println();
			System.out.println("menghitung luas belah ketupat");
			double d11,d22, luasdmd1;
			Scanner diagonal1=new Scanner(System.in);
			System.out.println("masukkan diagonal 1 : ");
			d11=diagonal1.nextDouble();
			System.out.println("masukkan diagonal 2 : ");
			d22=diagonal1.nextDouble();
			luasdmd1=d11*d22/2;
			System.out.println("luas belah ketupat :  "+luasdmd1);
			System.out.println("______________________");
			System.out.println();
			System.out.println("mari kita urutkan hasilnya dari yang terkecil lalu terbesar");
			double luas[]={lp1,luaspp1,luassgtg1,luascrcl1,luasdmd1};
			double wadah=0;
			for(int h=0; h<(luas.length); h++){
						for(int i=0; i<(luas.length-1); i++){
						if(luas[i]>luas[i+1]){
						wadah=luas[i];
						luas[i]=luas[i+1];
						luas[i+1]=wadah;
					}
				 }
						System.out.print(h+1+" = ");
						for(int d=0; d<luas.length; d++){
						System.out.print(luas[d]+"  ");
					}
						System.out.println();
				}
				System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<luas.length; i++){
					System.out.print(luas[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();

					break;

			case 7 :
			System.out.println();
			System.out.println("\t\t\t\t\t                         ");
			System.out.println("\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("\t\t\t\t\t    TERIMA KASIH TELAH   ");
			System.out.println("\t\t\t\t\t   MEMAKAI PROGRAM KAMI  ");
			System.out.println("\t\t\t\t\t   PROGRAM AKAN DITUTUP  ");
			System.out.println("\t\t\t\t\t    SAMPAI JUMPA LAGI    ");
			System.out.println("\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("\t\t\t\t\t                         ");
			System.out.println();
			System.exit(0);
		default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menub+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					System.exit(0);

		}
		}
		static void tambahan(){
			System.out.println();
			System.out.println("_____________________________________________________________________________________");
			System.out.println("halo disini saya fajar farhan sebagai yang bertanggung jawab pada program");
			System.out.println("saya mengucapkan terima kasih banyak pada pihak pihak yang terlibat dalam program ini");
			System.out.println("program ini saya buat untuk memenuhi tugas uas ");
			System.out.println("saya merasa bersyukur bisa menyelesaikan program ini");
			System.out.println("saya harap program ini akan berkembang menjadi lebih baik kedepannya");
			System.out.println("karena itu saya sangat mengaharapkan dukungan teman-teman semua");
			System.out.println("salam manis");
			System.out.println("______________________________________________________________________________________");
			System.out.println("FAJAR FARHAN SAMOSIR");
			next();
		}
		static void biodata(){
			System.out.println();
			System.out.println("NAMA   = FAJAR FARHAN SAMOSIR");
			System.out.println("TTL    = DUMAI, 25-NOVEMBER-2002");
			System.out.println("ALAMAT = JL. PANAM, KEC.BUKIT KAPUR, DUMAI, RIAU");
			System.out.println("AGAMA  = ISLAM");
			System.out.println("STATUS = MAHASISWA AKTIF POLITEKNIK KAMPAR");
			System.out.println("PRODI  = TEKNIK INFORMATIKA");
			System.out.println("NIM    = 202013030");
			System.out.println("UMUR   = 19 TAHUN");
			next();
		}

		static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("Apakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			luas();
		}else{
			penutup();
		}

	}
		static void penutup(){

		System.out.println();
		System.out.println("\tTerima Kasih Telah menggunakan program kami");
		System.out.println("\tProses Telah Selesai");
		System.out.println("\tKeluar Dari Sistem");
	}	


	}


