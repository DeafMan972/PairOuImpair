package com.joffrey.pairouimpair

class ProgramClass {

    private fun savoirNbrePairOuImpair(nbre : Int): Boolean{
        //Si un nombre est pair,cela retourne vrai
        var resultat = true
        if(nbre % 2 == 1){
            //Dans le cas contraire,cela retourne faux
            resultat = false
        }
        return resultat
    }



}