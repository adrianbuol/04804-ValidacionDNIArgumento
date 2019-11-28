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

package org.japo.java.app;
import org.japo.java.libraries.UtilesPrimitivos;
import org.japo.java.libraries.UtilesDNI;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {
    
    public static final char DNI_CTR = 'W';
    public static final int DNI_NUM = 45803306;

    public final void launchApp() {
        int n = UtilesPrimitivos.calcular(DNI_NUM, DNI_CTR);
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");
        System.out.printf("DNI ......: %d%c%n",DNI_NUM, DNI_CTR);
        System.out.println("---");
        System.out.println(UtilesDNI.validar(n));
    }
}
