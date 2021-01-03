# Fibabanka Java Bootcamp 2. Hafta Ödevi Bilgilendirme Dosyası



Bu projeyi ilk olarak generic bir Queue arayüzü (interface) , generic Queue arayüzünü implemente eden generic bir Queue sınıfı ve  Main sınıfından oluşturuldu . Generic Queue interface in de 3 adet metot vardı  ve bu metotlar add pool ve peek metoduydu. 

- Add metodu ile kuyruğa (queue) veri ekleniyor.
- Peek metodu ile kuyruğun başındaki eleman getiriliyor fakat kuyruktan çıkarılmıyordu.
- Pool metodu ile de (Queue yapısı gereği ilk giren eleman ilk çıkıyordu) kuyruğun o an başında bulunan elemanın çıkmasını sağlayacak metod yer alıyordu.

Bu metotları Queue arayüzünden implemente eden Queue sınıfı bu yukarıda bahsedilen işlemleri yapıyordu. Queue sınıfını  generic olarak yaptığımız için farklı veri tipleride kullanılabiliyordu.

Queue sınıfında 7 adet farklı alan tanımlı bu alanlardan ; 

- private int lenght degiskeni kuyruğa eleman eklendiğinde kuyruktaki eleman sayısını göstermek için tanımlandı. 
- private T variable; ise Generic olarak tanımlanan sınıfa hangi veri tipinde değer gönderilirse o tipteki değeri tutan alandır.
- private Queue<T> queueHead ise kuyruğun başındaki elemanı tutacak alandır.
- private Queue<T> queueTail ise kuyruğun sonundaki elemanı tutacak alandır.
- private Queue<T> temporaryVariable alanı ise kuyruktan çıkarılacak olan kuyruğun başındaki değeri alıp bu değeri kuyruktan çıkarmak için kullanılacak olan alandır.
- private Queue<T> queueNext alanı ise kuyruktaki elemanların birbiri ile ilişkisini gösterecek olan alandır tek yönlüdür.Yenir bir veri eklendi bu kuyruğa kuyruğun o an son kısmında bulunan değerin bir yanına eklenmesini işaret edecek olan alan diyebiliriz.
- private Object lock=new Object(); bir lock objesi oluşturulup object lock referansına verilmiştir. Bu ise synchronized blocklarda kullanılacaktır.

Bu alanların private olarak tanımlanma amacı ise başka sınıfların ve herhangi bir paketteki sınıfların bu tanımlı alanlara erişmesini istemediğimden dolayıdır. Getter setter metotları kullanılmıştır fakat setter metotlar private yapılarak da bu sınıflara başka sınıflar tarafından erişilip değiştirilmesi de engellenmiş oldu ve bu şekilde queue sınıfımı encapsulation yapmış oldum.Getter metotları ile de sadece read-only yapmış oldum bu tanımlı alanları.

Queue interfaceini sildim.Çünkü onun yerine anonim olarak kullanılabilecek metotları kullanmaya yani Ön tanımlı fonksiyonel interfaceleri kullanmaya karar verdim. Bu interfacelerden 

- Consumer <T> T tipinde obje gönderip üzerinde işlem yapmak için kullanılır.Metodu ise accept(). Ben bunu add kuyruğa veri eklemek için kullandım ve parametre olarak T tipinde bir değer gönderdim ve o an hangi generic tip üzerinde işlem yapılıyorsa o tipin değeri kullanılacak.
- Supplier <T> T tipinde bir obje kullanmak için kullanılır. Pool ve Peek metotları için bu fonksiyonel interface i kullandım. Bu da bana o an hangi generic tip üzerinde işlem yapıyorsam o değerler üzerindeki sonuçlar bana dönecektir.

Son olarak da bellekte oluşturulan yani heap alanında oluşan  nesneler başka threadler tarafından da erişilebilir olduğu için ve ben bu erişime sadece o an sadece bir thread in erişimini sağlamak için synchronized bloklarını kullanmya karar verdim.

Main sınıfında ise 2 adet farklı tipte Queue nesnesi oluşturdum ve bu nesneler integerQueue ve stringQueue referansları tarafından işaret ediliyor.

7 farklı thread kullanarakda multithread bir olay oluşturmaya çalıştım. İlk 3 thread kuyruğa   veri ekliyor. 4 ve 5 ' nci threadler ise integer tipteki kuyruktan, ilk olarak kuyruğun başındaki değeri gosteriyor sonra da o değeri kuyruktan çıkarmak için kullanılıyor. Thread in start metodu ile kullanıma hazır olduğunu işlemciye bildiriyor. 6'ncı thread ise String tipte kuyruğa veriler ekliyor. 7'nci thread ise String tipteki verilere pool ve peek işlemi yapılmak için kullanılacak. For döngüsü yardımı ile bu işlem 3 kez yapılacaktır.

Örnek Çıktı: 

```
Thread 1 is running
queueHead 1 queueTail 1 Queue Length : 1
queueHead 1 queueTail 2 Queue Length : 2
queueHead 1 queueTail 3 Queue Length : 3
queueHead 1 queueTail 4 Queue Length : 4
Thread 2 is running
queueHead 1 queueTail 5 Queue Length : 5
queueHead 1 queueTail 10 Queue Length : 6
queueHead 1 queueTail 15 Queue Length : 7
queueHead 1 queueTail 20 Queue Length : 8
Thread 3 is running
queueHead 1 queueTail 10 Queue Length : 9
queueHead 1 queueTail 20 Queue Length : 10
queueHead 1 queueTail 30 Queue Length : 11
queueHead 1 queueTail 40 Queue Length : 12
Thread 4 is running
Process Thread 4
The Peek method was executed: 1
The Pool method was executed: 
Thread 5 is running
1 th process. (Thread 5)
The Peek method was executed: 2
The Pool method was executed: 
2 th process. (Thread 5)
The Peek method was executed: 3
The Pool method was executed: 
3 th process. (Thread 5)
The Peek method was executed: 4
The Pool method was executed: 
Thread 7 is running
Not value in Queue
Thread 6 is running
queueHead 1 nci deger. queueTail 1 nci deger. Queue Length : 1
queueHead 1 nci deger. queueTail 2 nci deger. Queue Length : 2
queueHead 1 nci deger. queueTail 3 nci deger. Queue Length : 3
queueHead 1 nci deger. queueTail 4 nci deger. Queue Length : 4
queueHead 1 nci deger. queueTail 5 nci deger. Queue Length : 5
Main thread is terminating.

```



