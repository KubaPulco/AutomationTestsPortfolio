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

Test Cases:

**Test Case 1: basketGeneralTest() method in BasketTest class**

*Title:* Adding an item to the basket using an unregistered account.  
*Objective:* Verify user redirection to the subsequent stages of the purchase.  
*Initial Conditions:* The user is not logged into the online store application.

**STEPS:**
1. Go to the page https://wkdzik.pl/ubrania.
2. Accept cookies.
3. Click on the first item on the page (hoodie).
4. Select size L by clicking the button.
5. Click the "Add to Cart" button.
6. Click the "Place Order" button.
7. Fill out the form with correct data.
8. Expand the "Delivery Country" list and choose "Germany."

**RESULT:**
- The user is redirected to the "Clothing" page.
- The user has accepted cookies and can continue using the site.
- The user goes to the item page.
- The clothing size is set to L.
- The item is added to the cart.
- The user is redirected to the "Basket" page.
- The form is filled out by the user.
- "Germany" is selected from the list.

**Test Case 2: testSortItemsAscending() method in MainPageTests class**

*Title:* Checking the correct functioning of the item sorting list on the page.  
*Objective:* Verify the desired display of products on the page, in this case, from cheapest to most expensive.  

**STEPS:**
1. Go to the page https://wkdzik.pl/ubrania.
2. Click on Sort.
3. Choose "Price ascending" from the list.

**RESULT:**
- The user is redirected to the "Clothing" page.
- A list with options to choose from appears: Product name A-Z, Product name Z-A, Price ascending, Price descending.
- Items on the page are displayed in order from cheapest to most expensive.
