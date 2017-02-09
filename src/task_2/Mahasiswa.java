/**
 *  Nama = Sylvia Dwi Anggraini
 *  NIM  = 1301154469
 */
package task_2;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    private char[] Nilai;
    private int i;
    
    public Mahasiswa(){
        this.Status = "Tidak Lulus";
        this.i = 0;
        this.Nilai = new char[10];
    }
        
    public Mahasiswa(String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.i = 0;
        this.Nilai = new char[10];
        
    }
  
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public char getNilai(int i) {
        return Nilai[i];
    }

    public void setNilai(char[] Nilai) {
        this.Nilai = Nilai;
    }

   
    
    public void addNilai(char Nilai){
        this.Nilai[i] = Nilai;
        i = i+1;
    }
    
    @Override
    public String toString(){
        return NIM+" " +Nama+ " "+Status+"= "+ new String(Nilai);
     }
    
    public char cekNilai(Mahasiswa m){
        int a;
        for(char p = 'A'; p<='E'; p++){
            for (int q=0 ; q<i ; q++){
                if(p == Nilai[q]){
                    for(int r=0; r<=i; r++){
                        if(p == m.Nilai[r])
                            return p;
                        
                    }
                }
            }
           
            
            
}
 return Nilai[i];      
}
}
    
   
    
    



