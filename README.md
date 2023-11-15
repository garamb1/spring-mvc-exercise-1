# spring-mvc-exercise-1

A partire dall'applicazione vista precedentemente, implementa:
 - Nel form di aggiunta, richiedi che l'input sia presente con l'attributo HTML `required`
 - Nel CollectionController, implementa controlli sulla qualità dei dati, ad esempio name non vuoto.
   - Quando l'input ricevuto dalla richiesta POST non è corretto, ritorna una view di errore, ad esempio `view-error`, contenente un messaggio che spiega cosa è andato storto.
 - Alla vista `view-success`, aggiungi un collegamento che permette all'utente di tornare alla lista di elementi dopo l'aggiunta di un nuovo elemento.
 - Nel CollectionController, implementa un metodo con mapping che permetta di eliminare o visualizzare uno specifico elemento
   - Implementa le view corrispondenti, come, ad esempio, `view-details`
