public abstract class FormeRectangulaire {
    protected int largeur;
    protected int hauteur;
    public FormeRectangulaire(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public int getLargeur() {
        return largeur;
    }
    public int getHauteur() {
        return hauteur;
    }
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    public int calculerAir(){
        return largeur * hauteur;
    }
}
