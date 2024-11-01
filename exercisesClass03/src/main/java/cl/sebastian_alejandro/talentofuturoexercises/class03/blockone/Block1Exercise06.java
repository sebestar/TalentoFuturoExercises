/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blockone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Block1Exercise06 {

  // [EN] Reverse a map (to pass from K,V (key-value) to V,K (value-key))
  // [ES] Invierta un mapa (pasar de K,V (clave-valor) a V,K (valor-clave))

  public static void main(String[] args) {
    ReverseAMap();
    System.out.println("Good bye!");
  }

  private static void ReverseAMap() {
    Map<String, String> articlesByCode = new HashMap<>();
    articlesByCode.put("AT01", "Tomato");
    articlesByCode.put("AT02", "Onion");
    articlesByCode.put("AT03", "Apple");
    articlesByCode.put("AT04", "Eggs");
    articlesByCode.put("AT05", "Bread");
    
    Map<String, String> reversedArticles = new HashMap<>();
    articlesByCode.forEach((key, value) -> {reversedArticles.put(value, key);});
    
    System.out.println(articlesByCode); 
    System.out.println(reversedArticles); 
  }
}
