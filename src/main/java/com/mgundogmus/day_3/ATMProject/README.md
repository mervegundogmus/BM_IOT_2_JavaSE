## ATM Projesi
Bu proje kullanıcının giriş yaptığı, işlemler gerçekleştirdiği ve kullanıcı doğrulama işlemlerini içeren basit bir ATM projesidir.
Proje kapsamında amaçlanan Enum, collection, OOP, string, file ve array kavramlarını kullanarak pratik yapmaktır.

### Adım 1: Proje Yapısı ve Gerekli Sınıfların Tanımlanması
Öncelikle, proje yapısını oluşturmak için gerekli sınıfları ve enumları tanımlayacağız.

- `ATM.java`: Ana sınıf ve ana menü.
- `User.java`: Kullanıcı bilgilerini tutacak sınıf.
- `Account.java`: Kullanıcı hesabını temsil eden sınıf.
- `TransactionType.java`: İşlem türlerini belirten enum.
- `FileUtil.java`: Dosya işlemlerini yapacak sınıf.

### Adım 2: Kullanıcı ve Hesap Sınıflarını Oluşturma
- `User` `Account` `TransactionType` sınıfları oluşturulur.
### Adım 3: Dosya İşlemleri ve Kullanıcı Doğrulama
- `FileUtil` sınıfı oluşturulur.
### Adım 4: ATM Ana Sınıfı ve Menü
- `Login`: Login işlemi, Kullanıcıya üç kez şifre girme hakkı verilir. Yanlış şifre girerse deneme sayısı artırılır ve üçüncü denemeden sonra hesap bloke edilir.
- `Deposit`: Para yatırma işlemi, Kullanıcıdan yatırmak istediği miktar alınır ve bakiyesine eklenir.
- `Withdraw`: Para çekme işlemi, Kullanıcıdan çekmek istediği miktar alınır ve bakiyesi yeterliyse bakiyesinden düşülür.
### Adım 5: Kullanıcı Dosyasının Oluşturulması
- Kullanıcı şifrelerini tutacak `users.txt` dosyası oluşturulur.
