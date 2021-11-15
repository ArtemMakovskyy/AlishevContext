package ar.mak.ConfigOnlyAnno;

import ar.mak.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}