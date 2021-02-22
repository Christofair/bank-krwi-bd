package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author makma
 */
public class RealizacjazamowieniaListModel extends DefaultListModel<String>  {
    List<Integer> IdRealizacjiNaLiscie;
    public RealizacjazamowieniaListModel(){
        IdRealizacjiNaLiscie = new ArrayList<>();
    }
    
    public void dodajRealizacjeZamowien(List<Realizacjazamowienia> rz){
        if(!this.isEmpty()){
            this.clear();
            IdRealizacjiNaLiscie.clear();
        }
        rz.forEach(e->{
            addElement(e.getIdrealizacji()
                    + "  |zam�wienie nr.: " 
                    + e.getIdzamowienia()
                    + "  |pobranie nr.: "
                    + e.getIdpobrania()
                    );
            IdRealizacjiNaLiscie.add(e.getIdrealizacji());
        });
    }
}
