package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Medicine;

public class MedicineTableModel extends AbstractTableModel {

    public static final int MEDICINE_CODE_COL = 0;
    public static final int MEDICINE_NAME_COL = 1;
    public static final int MEDICINE_DESCRIPTION_COL = 2;
    public static final int MEDICINE_COMPOSITION_COL = 3;
    public static final int MEDICINE_PRICE_COL = 2;
    public ArrayList<Medicine> medicines;
    
    public MedicineTableModel(ArrayList<Medicine> list){
            medicines = new ArrayList<Medicine>(list);
    }
    
    @Override
    public int getRowCount() {
        return medicines.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int lines, int columns) {
        Medicine medicine = medicines.get(lines);
        if(columns == MEDICINE_CODE_COL) return medicine.getCode();
        if(columns == MEDICINE_NAME_COL) return medicine.getName();
        if(columns == MEDICINE_DESCRIPTION_COL) return medicine.getDescription();
        if(columns == MEDICINE_COMPOSITION_COL) return medicine.getComposition();
        if(columns == MEDICINE_PRICE_COL) return medicine.getPrice();
        return "";
    }
    
    @Override
    public String getColumnName(int columns){
        if(columns == MEDICINE_CODE_COL) return "Code";
        if(columns == MEDICINE_NAME_COL) return "Name";
        if(columns == MEDICINE_DESCRIPTION_COL) return "Description";
        if(columns == MEDICINE_COMPOSITION_COL) return "Composition";
        if(columns == MEDICINE_PRICE_COL) return "Price";
        return "";
    }
    
}
