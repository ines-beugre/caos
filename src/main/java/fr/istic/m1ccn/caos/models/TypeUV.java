package fr.istic.m1ccn.caos.models;

/**
 * @author Ines Beugre
 */
public class TypeUV {

    private String nameUV;
    private Integer effectifMax;
    private Integer effectifMin;
    private TypeUV prerequis;

    //constructeur
    public TypeUV(String nameUV, Integer effectifMax, Integer effectifMin, TypeUV prerequis) {
        super();
        this.nameUV = nameUV;
        this.effectifMax = effectifMax;
        this.effectifMin = effectifMin;
        this.prerequis = prerequis;
    }

    public String getNameUV() {
        return nameUV;
    }

    public void setNameUV(String nameUV) {
        this.nameUV = nameUV;
    }

    public Integer getEffectifMax() {
        return effectifMax;
    }

    public void setEffectifMax(Integer effectifMax) {
        this.effectifMax = effectifMax;
    }

    public Integer getEffectifMin() {
        return effectifMin;
    }

    public void setEffectifMin(Integer effectifMin) {
        this.effectifMin = effectifMin;
    }

    public TypeUV getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(TypeUV prerequis) {
        this.prerequis = prerequis;
    }

}
