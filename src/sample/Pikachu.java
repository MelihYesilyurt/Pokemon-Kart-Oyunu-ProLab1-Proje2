/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author J4
 */
public class Pikachu extends Pokemon{
    
    private final int hasarPuani=40;
    private boolean kartKullanildiMi;
    
    public Pikachu() {
        super();
        kartKullanildiMi=false;
    }

    public Pikachu(String pokemonAdi, String pokemonTip) {
        super(pokemonAdi, pokemonTip);
        kartKullanildiMi=false;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    @Override
    public void hasarPuaniGoster(){
        System.out.println(hasarPuani);
    }
    
    @Override
    public int hasarPuaniDondur(){
        return getHasarPuani();
    }
    
}
