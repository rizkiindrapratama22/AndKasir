/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andriawan.kasir.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utilities.Formater;

/**
 *
 * @author andriawan
 */
public class TableBarang extends AbstractTableModel {
    
    List<Barang> barang;

    public TableBarang(List<Barang> barang) {
        this.barang = barang;
    }

    @Override
    public int getRowCount() {
        return barang.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return barang.get(rowIndex).getKodeBarang();
            case 1:
                return barang.get(rowIndex).getNamaBarang();
            case 2:
                return barang.get(rowIndex).getHargaFormat();
            case 3:
                return barang.get(rowIndex).getStok();
            case 4:
                return Formater.setNiceIndonesianDate(barang.get(rowIndex).getDateInput());
            default:
                return null;
                    
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Barang";
            case 1:
                return "Nama Barang";
            case 2:
                return "Harga";
            case 3:
                return "Stok";
            case 4:
                return "Tanggal Masuk";  
            default:
                return null;
        }
    }
    
    
    
}
