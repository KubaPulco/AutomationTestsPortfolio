Test automation project based on POM principles
2 proste przypadki testowe oparte o wzorzozec projektowy Page Object Model, 

Przypadki testowe:

Ten test wykonuje metoda basketGeneralTest() w klasie BasketTest

Tytuł: Dodawanie przedmiotu do koszyka za pomocą konta bez rejestracji.
Cel: Weryfikacja przeniesienia użytkownika na kolejne etapy zakupów.
Warunki początkowe: Użytkownik nie jest zalogowany w aplikacji sklepu internetowego.

KROK                                                        
1. Wejdz na stronę https://wkdzik.pl/ubrania
2. Zaakceptuj pliki cookie
3. Kliknij w pierwszy przedmiot na stronie (bluza)
4. Wybierz rozmiar L klikając w przycisk
5. Kliknij przycisk "Do koszyka"
6. Kliknij przycisk "Złóż zamówienie"
7. Wypełnij formularz poprawnymi danymi
8. Rozwiń listę "Kraj dostawy" i wybierz "Niemcy"

REZULTAT 
1. Użytkownik został przeniesiony na stronę "Ubrania"
2. Użytkownik zaakceptował pliki cookie i może kontynułować korzystanie ze strony.
3. Użytkownik przechodzi do strony przedmiotu
4. Rozmiar ubrania został ustawiony na L.
5. Przedmiot zostaje dodany do koszyka.
6. Użytkownik zostaje przeniesiony na stronę "Basket"
7. Formularz zostaje wypełniony przez użytkownika
8. Na liście zostaje wybrany kraj "Niemcy"




Ten test wykonuje metoda testSortItemsAscending() w klasie MainPageTests

Tytuł: Sprawdzanie poprawnego działania listy do sortowania przedmiotów na stronie.
Cel: Weryfikacja porządanego wyświetlania produktów na stronie, w tym przypadku od najtańszego do najdroższego.

KROK  
1. Wejdź na stronę https://wkdzik.pl/ubrania
2. Kliknij w Sortuj
3. Wybierz z listy "Cena rosnąco"

REZULTAT
1. Użytkownik został przeniesiony na stronę "Ubrania".
2. Pojawia się lista z opcjami do wyboru: Nazwa produktu A-Z, Nazwa produktu Z-A, Cena rosnąco, Cena malejąco.
3. Przedmioty na stronie wyśiwetlają się w kolejności od najtańszego do najdroższego.
