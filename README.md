                                        ASSIGNMENT MODUL 3
 
                 Raport LOC, complexitate ciclomatica, complexitate cognitiva,
                             revizuire informala si analiza statica

 LOC - 145

 Complexitate cilomatica metoda evaluateExpression 7
 
 Complexitate cognitiva metoda evaluateExpression 15

 Complexitate cilomatica metoda Calculate 15

 Complexitate cognitiva metoda evaluateExpression 16

                                        Revizuire informala
Tratarea erorilor:

    Ar fi utilă o tratare mai detaliată a erorilor. 
    Mesajul ERROR este suficient de explicit, dar poate fi extins pentru a specifica ce parte a expresiei a cauzat eroarea.
    
Gestionarea mai bună a tipurilor numerice:

    Se folosește Float, dar pentru calcule matematice complexe, se pot utiliza Double pentru o precizie mai mare.

Comentarii insuficiente:

    Unele secțiuni sunt explicate cu comentarii, dar nu toate.
    Adăugarea de comentarii ar ajuta la clarificarea logicii pentru alte persoane care citesc codul.


                                        Analiza Statica
Am folosit instrumentul Lint

calculator.java - linia 18, 37 - denumirea metodei ToString modificata la myString*
                  linia 24 -    denumirea metodei Run modificata la myRun*
                  linia 53 -    bucla for modificata in for imbunatatit*
                  linia 54 -    instructiunea if modificata in switch*
                  linia 70, 75, 96, 106, 119, 131, 147, 157, 171, 183 denumirea metodei Calculate modificata in myCalculate*
                  linia 71 - variabila textResult nu e necesar sa fie declarata separat*
                  linia 184 - nu e necesar return
                                        
