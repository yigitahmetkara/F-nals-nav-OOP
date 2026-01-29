Final Sınavı Pratik - Uçuş Rezervasyon Sistemi
Bu proje, Java programlama dili kullanılarak geliştirilmiş bir Uçuş ve Bilet Rezervasyon Sistemi simülasyonudur. Projenin temel odağı, gerçek dünya senaryolarındaki hataları yönetmek için Custom Exceptions (Özel İstisnalar) yapısını ve nesne yönelimli programlama (OOP) prensiplerini uygulamaktır.

Proje Yapısı ve Özellikler
Proje, bir rezervasyon sisteminin temel bileşenlerini temsil eden şu sınıfları ve özel hata yapılarını içermektedir:

Booking & Ticket: Rezervasyon ve bilet işlemlerinin mantıksal yönetimini sağlar.

Flight & Passenger: Uçuş bilgilerini ve yolcu detaylarını (İsim, Pasaport vb.) modelleyen sınıflardır.

Custom Exceptions (Özel Hatalar):

BookingException: Rezervasyon sırasında oluşabilecek genel hatalar.

InvalidPassengerException: Geçersiz yolcu bilgileri girildiğinde fırlatılan hata.

SeatNotAvailableException: Koltuk doluluğu veya koltuk seçimi hataları için tasarlanmıştır.

Teknik Detaylar
Dil: Java.

IDE: Eclipse.

Kullanılan Kavramlar: Kalıtım (Inheritance), Kapsülleme (Encapsulation), Try-Catch Blokları ve Throw/Throws kullanımı.

Kurulum ve Çalıştırma
Projeyi yerel bilgisayarınıza klonlayın:

Bash
git clone https://github.com/yigitahmetkara/finalsinaviprat.git
Eclipse IDE'sini açın ve File > Import > Existing Projects into Workspace adımlarını izleyerek projeyi içeri aktarın.

TestClass.java dosyasını bularak uygulamayı çalıştırın.
