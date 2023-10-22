public class TaiKhoan {
    private int SoDu;

    public TaiKhoan(int soDu) {
        SoDu = soDu;
    }

    public void RutTien(int soTien){
        if(soTien > SoDu){
            throw new SoDuKhongDuException("so du khong du roi!");
        }
        SoDu -= soTien;
    }

    public int getSoDu() {
        return SoDu;
    }
    public void napTien(Object soTien) throws SaiDinhDangTienException {
        if(soTien instanceof Integer){
            SoDu += (Integer)soTien;

        }
        else {
            throw new SaiDinhDangTienException("Nhap Sai Dinh Dang Tien Roi!");
        }
    }
}
