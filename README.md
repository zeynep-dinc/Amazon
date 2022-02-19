# Amazon


## Kullanılan Dil ve Teknolojiler Temel
Proje "JAVA" dilinde yazılmış olup, proje yönetim safhası için "MAVEN" aracından yardım alınmıştır. Test gelişiminde "davranış güdümlü test" modeli kullanılmıştır. Bu hususta da "cucumber" kullanılmıştır.  


Projeyi çalıştırmak ve senaryoyu okumak için:
src/test/java/features/AmazonUrunArama.feature

Hooks ve StepDefs classları için:
src/test/java/steps

Testte kullanılan elementler ve step fonksiyonlarının detayları için:
src/main/java/amazon/Amazon.java

Temel fonksiyonlar için:
src/main/java/base/BaseEventClass.java

Tarayıcı olarak <u> Windows </u> işetim sistemi için <u> Chrome </u> driver <u> versiyon 98 </u> tercih edilmiştir.

Driver bilgilerini okumak/güncellemek için:
src/main/resources/config.properties

Tarayıcının kodda belirtilen konumu:
src/main/resources/drivers

## Senaryo 
1. sayfa basliginin içinde "Amazon.com.tr" oldugunu dogrula
2. cerezler alaninin acilip acilmadigini kontrol et
3. "iphone 13 512" urununu arat
4. sayfa basliginin içinde "Amazon.com.tr : iphone 13 512" oldugunu dogrula
5. ilk urunu sec
6. urunun bilgilerini yazdir
