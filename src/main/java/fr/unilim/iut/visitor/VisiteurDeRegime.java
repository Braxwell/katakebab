package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Tomate;

public interface VisiteurDeRegime {
	
	public boolean visit(Agneau ingredientAgneau);
	
	public boolean visit(Boeuf ingredientBoeuf);
	
	public boolean visit(Crevette ingredientCrevette);
	
	public boolean visit(Fromage ingredientFromage);
	
	public boolean visit(Oignon ingredientOignon);
	
	public boolean visit(Pain ingredientPain);
	
	public boolean visit(Salade ingredientSalade);
	
	public boolean visit(Sauce ingredientSauce);
	
	public boolean visit(Tomate ingredientTomate);
	
	public boolean visit(Assiette assiette);

}
