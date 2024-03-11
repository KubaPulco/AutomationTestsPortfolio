Test automation project based on POM principles
2 proste przypadki testowe oparte o wzorzozec projektowy Page Object Model, 

Przypadki testowe:

Ten test wykonuje metoda basketGeneralTest() w klasie BasketTest

Tytuł: Dodawanie przedmiotu do koszyka za pomocą konta bez rejestracji.
Cel: Weryfikacja przeniesienia użytkownika na kolejne etapy zakupów.
Warunki początkowe: Użytkownik nie jest zalogowany w aplikacji sklepu internetowego.

KROKI                                                     
1. Wejdz na stronę https://wkdzik.pl/ubrania
2. Zaakceptuj pliki cookie
3. Wybierz typ produktu z listy rozwijanej -> "Bluzy"
4. Wybierz bluza fioletowa
5. Wybierz rozmiar XS klikając w przycisk
6. Kliknij przycisk "Do koszyka"
7. Kliknij przycisk "Złóż zamówienie"
8. Wypełnij formularz poprawnymi danymi
9. Rozwiń listę "Kraj dostawy" i wybierz "Niemcy"

REZULTAT 
1. Użytkownik został przeniesiony na stronę "Ubrania"
2. Użytkownik zaakceptował pliki cookie i może kontynułować korzystanie ze strony.
3. Użytkownik przechodzi do strony z bluzami.
4. Użytkownik przechodzi do strony z wybraną bluzą i możliwością wybrania rozmiaru.
5. Rozmiar ubrania został ustawiony na L.
6. Przedmiot zostaje dodany do koszyka.
7. Użytkownik zostaje przeniesiony na stronę "Basket"
8. Formularz zostaje wypełniony przez użytkownika
9. Na liście zostaje wybrany kraj "Niemcy"




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

STEPS

1. Go to the website https://wkdzik.pl/ubrania.
2. Accept cookies.
3. Choose the product type from the dropdown list -> "Bluzy" (Hoodies).
4. Select the purple hoodie.
5. Choose size XS by clicking the button.
6. Click the "Do koszyka" (Add to cart) button.
7. Click the "Złóż zamówienie" (Place an order) button.
8. Fill out the form with correct data.
9. Expand the "Kraj dostawy" (Country of delivery) list and select "Niemcy" (Germany).
RESULT

1. The user is redirected to the "Ubrania" (Clothes) page.
2. The user has accepted cookies and can continue using the website.
3. The user navigates to the page with hoodies.
4. The user goes to the page with the selected purple hoodie and the option to choose the size.
5. The size of the clothing is set to L.
6. The item is added to the cart.
7. The user is redirected to the "Basket" page.
8. The form is filled out by the user.
9. "Niemcy" (Germany) is selected from the list.

**Test Case 2: testSortItemsAscending() method in MainPageTests class**

*Title:* Checking the correct functioning of the item sorting list on the page.  
*Objective:* Verify the desired display of products on the page, in this case, from cheapest to most expensive.  

**STEPS:**
1. Go to the page https://wkdzik.pl/ubrania.
2. Click on Sort.
3. Choose "Price ascending" from the list.

**RESULT:**
1. The user is redirected to the "Clothing" page.
2. A list with options to choose from appears: Product name A-Z, Product name Z-A, Price ascending, Price descending.
3. Items on the page are displayed in order from cheapest to most expensive.
