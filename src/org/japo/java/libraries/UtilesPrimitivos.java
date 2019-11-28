/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es
 */
public class UtilesPrimitivos {
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
 
    public static final int calcular(int num, char ctr){
        int resultado = 0;
        double dniNum = num % 23;
//      charAt efectuará un numero de saltos proporcional al resultado de dniNum
        char letraOK = LETRAS.charAt((int) dniNum);
        
        if (ctr == letraOK) {
            resultado = 1;
        } else {
            resultado = 2;
        }
        return resultado;
    }
}
