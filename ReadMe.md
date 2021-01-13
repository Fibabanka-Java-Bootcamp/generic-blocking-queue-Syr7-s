Bu ödevde jenerik bir queue (kuyruk) veri yapısı implementasyonu implemente edilmesi bekleniyor. Queue veri yapısı
gerçek hayatta bildiğimiz, biletçilerin önünde oluşan kuyruklar gibi çalışır. Kuyruğa ilk giren veri kuyruktan ilk çıkar
buna FIFO (first in first out) yaklaşımı denir.

![image](figures//queue.png)

Bu ödevdedeki teknik beklentiler aşağıdaki gibidir:

- Ödev nesneye yönelik programlama prensipleri göze alınarak geliştirilmelidir
- Queue her tipte veri depolamaya elverişli olacak şekilde jenerik olarak geliştirilmelidir
- Hata durumları göz önünde bulundurulmalıdır
- Queue dinamik olarak veri saklamaya uygun olmalı herhangi bir boyut limiti olmamalıdır. (Bu nedenle veri saklamak için
  array kullanımı önerilmiyor)
- Queue minimum aşağıdaki metodları sağlamalıdır

```


add(value) -> Kuyruğa yeni veri eklemek için 

peek() -> Kuyruktan sıradaki veriyi sılmeden okumak için 

poll() -> Kuyruktan veri okumak için, okunan veri silinmeli


```

