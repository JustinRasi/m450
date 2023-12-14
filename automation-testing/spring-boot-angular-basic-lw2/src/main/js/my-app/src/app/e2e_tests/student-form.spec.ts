import {browser, by, element} from "protractor";

describe('Student Form Test', function () {
  it('should submit the form successfully', function () {
    browser.get('students'); // Pfad zu Ihrer Studentenformularseite

    // Füllen Sie das Formular aus
    element(by.id('name')).sendKeys('John Doe');
    element(by.id('email')).sendKeys('john.doe@example.com');
    element(by.css('button.btn-info')).click();

    // Überprüfen Sie, ob die Studentenliste angezeigt wird
    expect(element.all(by.css('tr')).count()).toBeGreaterThan(0);
  });
});
