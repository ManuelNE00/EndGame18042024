/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author mene_
 */
public class EndGame {

    public static void main(String[] args) {
     Heroe blackPanter=new Heroe("Black Panter grr", "Ser el rey de todo Wakanda", "Garras de Vibranium");
     Villano galactus=new Villano("Galactus", "Devorar mundos", "Usa de chalan a Silver Surfer");
     Avenger ironMan=new Avenger("Tony Stark", "Genio, filantropo, multimillonario, playboy", "Mark 42", "Prime");
     Thanos thanos=new Thanos("Thanos", "El titan loco", "Ejercito chitaury", "Gemas del infinito");
     
     Personaje[] personajes={blackPanter, galactus, ironMan, thanos};
     for(Personaje personaje:personajes){
       personaje.atacar();
     }
     
     ((Avenger)ironMan).reunirse();
     
     thanos. chasquearDedos();
     
    }
}
