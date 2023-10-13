# TCKimlikNoKontrolu
Bu Java console uygulaması kullanıcıdan alınan TC KimlikNumarasının doğruluğunu kontrol eder
Örnek TC:27236390934
İlk hane 0 olamaz.
Kimlik numaralarının son 2 harfi, sadece ilk 9 rakamının doğrulayıcısı konumundadır. Yani asıl numaramız ilk 9 rakamdadır. 
TC kimlik numaraları 11 basamaktan oluşmaktadır. İlk 9 basamak arasında kurulan bir algoritma bize 10. basamağı,
ilk 10 basamak arasında kurulan algoritma ise bize 11. basamağı verir.

TC kimlik numaralarımızın 1. 3. 5. 7. ve 9. hanelerinin toplamının 7 katından,
2. 4. 6. ve 8. hanelerinin toplamı çıkartıldığında, elde edilen sonucun 10'a bölümünden kalan, yani mod10'u bize 10. haneyi verir.

TC kimlik numaralarımızın 1. 2. 3. 4. 5. 6. 7. 8. 9. ve 10. hanelerin toplamından elde edilen sonucun 10'a bölümünden kalan, yani mod10'u bize 11. haneyi verir.
