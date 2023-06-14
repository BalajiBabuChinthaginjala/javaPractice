package kiku.practice;

import org.apache.tika.exception.TikaException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

import static org.junit.Assert.*;

public class WordDirectionTest {
    @Test
    public void storingDataTest() throws TikaException, IOException, SAXException {
        WordDirection sut = new WordDirection();
        String data = sut.storingData("C:\\Users\\Admin\\AppData\\Roaming\\JetBrains\\IdeaIC2023.1\\scratches\\scratch_5.xml");
        assertEquals("[Forward Direction --->Tom M K: Request to configure display setting to indicate LDD version インシデントID INC000000056012 販社チケット番号 00013142 販社名 BUS 販社チケット運用カテゴリ1 20 - Customization Req. 販社チケット製品名 Fleet RMM サマリー Tom M K: Request to configure display setting to indicate LDD version 補足 Hello The GCS is requesting Configure that the LDD version be displayed in the device list. This was the same request made for RDT in INC000000299502 Please see attachement. Thank you for your support. Thomas M Kelly ESS 報告日 2022-11-01 18:01:26 +00:00 応答日 2022-11-01 22:01:02 +00:00 解決日時 2023-04-27 00:22:29 +00:00 完了日時 2023-05-27 02:00:00 +00:00 優先度 Low ステータス Closed 回答まとめステータス Resolution 解決カテゴリ1 40 - Inquiry / 問い合わせ 解決製品名 Fleet RMM 解決 関連ナレッジ 履歴 登録日時 2022-11-01 18:11:37 +00:00 登録者 POWERCENTER 補足 販社からのエスカレーション 登録日時 2022-11-01 22:01:00 +00:00 登録者 BTE07418 補足 Dear Sir / Madam Thank you for your daily technical support. We have received your incident ticket. *I will forward this ticket to our expert team so the person in charge will contact you later. Please wait for the next contact from them. Thank you and better co-being, Kenny Matsuo / KMI-Service Desk 登録日時 2022-11-11 06:48:15 +00:00 登録者 BTE13281 補足 Dear Tom-san, Sorry for late response. Unfotunately, Fleet RMM is not supported the config for LDD display now. Is the request from GCS an urgent request? Best Regards, Ebata. 登録日時 2022-11-11 19:21:34 +00:00 登録者 POWERCENTER 補足 Dear Ebata-san, Thank you for the last response. The GCS has replied that it is not urgent, but they are worried that when the time comes to upgrade some of their customers from RDT to Fleet RMM, they will loose this support function. Can it be implemented in 1.3? Thank you for your support. Thomas M Kelly ESS 登録日時 2022-11-14 08:55:56 +00:00 登録者 BTE13281 補足 Dear Tom-san, Thank you for your confirming ,I can understand that this is not urgent.It is not a candidate for new features in v1.3 currently. I don't know if it will be select v1.3 feature, but may I register the request as a standard request? Best Regards, Ebata. 登録日時 2022-11-15 15:51:38 +00:00 登録者 POWERCENTER 補足 Dear Ebata-san, Thank you for the last reply. Please consider this for the 1.3 release. The GCS feels that supporting Accenture with this function is important and should have already been available with any Fleet RMM release. Please consider it for 1.3. Thank you for your support. Thomas M Kelly ESS 登録日時 2022-11-18 08:19:49 +00:00 登録者 BTE13281 補足 Dear Tom-san, I registerd to the request list. It seems that developer/marketing side are also received the request from Mark-san to Nagai-san at today. This is just a my comments, Fleet RMM v1.3 has received many requests at this time and additional requests are not likely to be easy. Best Regards, Ebata. 登録日時 2022-11-18 17:11:28 +00:00 登録者 POWERCENTER 補足 Dear Ebata-san, Thank you for the last response. Thank you for registering this item to the request list. I understand your comments that there are many request for v1.3 and it is not easy. However, this function is important to for the GCS to support major accounts like Accenture. We have many large customers that cannot wait until ver 1.4 for full functionality. Again, the customer had this functionality with RDT and now needs it for Fleet RMM. Please request this item for 1.3. Thank you for your support, Thomas M Kelly ESS 登録日時 2022-11-24 07:05:18 +00:00 登録者 BTE13281 補足 Dear Mark-san, Thank you for your support. I understand your situation very well. From my point of view, I can inform the developer side, but the features in Fleet RMMv1.3 are being coordinated between the marketing side and the development side. I apologize for the inconvenience, but could you please negotiate with the marketing side? Best Regards, Ebata. 登録日時 2023-04-10 05:42:38 +00:00 登録者 BTE13281 補足 Dear Mark-san, Unfortunately, as you know, this request has been dropped in Fleet RMM v1.3. It may be implemented in Fleet RMM v1.4 or later. Best Regards, Ebata. 登録日時 2023-04-26 21:21:26 +00:00 登録者 POWERCENTER 補足 Dear Ebata-san, Thank you for the last reply. The ticket can be closed. Thank you for your support, Thomas M Kelly ESS 登録日時 2023-04-27 00:22:28 +00:00 登録者 BTE13281 補足 Dear Mark-san, Thank you for you r understanding. We will close this ticket. Best Regards, Ebata. 登録日時 2023-05-27 02:00:00 +00:00 登録者 POWERCENTER 補足 *** Incident was closed ***\n" +
                ", Number of First Words --->Tom M K: Request to configure display setting to indicate LDD version インシデントID INC000000056012 販社チケット番号 00013142 販社名 BUS 販社チケット運用カテゴリ1 20\n" +
                ", Number of Last Words --->*** closed was Incident *** 補足 POWERCENTER 登録者 +00:00 02:00:00 2023-05-27 登録日時 Ebata. Regards, Best ticket. this close will We\n" +
                ", First Letter of each word --->T M K R t c d s t i L v イ I 販 0 販 B 販 2 - C R 販 F R サ T M K R t c d s t i L v 補 H T G i r C t t L v b d i t d l T w t s r m f R i I P s a T y f y s T M K E 報 2 1 + 応 2 2 + 解 2 0 + 完 2 0 + 優 L ス C 回 R 解 4 - I / 問 解 F R 解 関 履 登 2 1 + 登 P 補 販 登 2 2 + 登 B 補 D S / M T y f y d t s W h r y i t * w f t t t o e t s t p i c w c y l P w f t n c f t T y a b c K M / K D 登 2 0 + 登 B 補 D T S f l r U F R i n s t c f L d n I t r f G a u r B R E 登 2 1 + 登 P 補 D E T y f t l r T G h r t i i n u b t a w t w t t c t u s o t c f R t F R t w l t s f C i b i i 1 T y f y s T M K E 登 2 0 + 登 B 補 D T T y f y c , c u t t i n u i n a c f n f i v c I d k i i w b s v f b m I r t r a a s r B R E 登 2 1 + 登 P 補 D E T y f t l r P c t f t 1 r T G f t s A w t f i i a s h a b a w a F R r P c i f 1 T y f y s T M K E 登 2 0 + 登 B 補 D T I r t t r l I s t d s a a r t r f M t N a t T i j a m c F R v h r m r a t t a a r a n l t b e B R E 登 2 1 + 登 P 補 D E T y f t l r T y f r t i t t r l I u y c t t a m r f v a i i n e H t f i i t f t G t s m a l A W h m l c t c w u v 1 f f f A t c h t f w R a n n i f F R P r t i f 1 T y f y s T M K E 登 2 0 + 登 B 補 D M T y f y s I u y s v w F m p o v I c i t d s b t f i F R a b c b t m s a t d s I a f t i b c y p n w t m s B R E 登 2 0 + 登 B 補 D M U a y k t r h b d i F R v I m b i i F R v o l B R E 登 2 2 + 登 P 補 D E T y f t l r T t c b c T y f y s T M K E 登 2 0 + 登 B 補 D M T y f y r u W w c t t B R E 登 2 0 + 登 P 補 * I w c *\n" +
                ", Incremental Position --->T M : u t o s t t n D s イ N チ 1 販 U チ 0 - u q ケ F M リ m M : q o c i t o i D r 足 H h S s r o a e L e e p i h v t T a e e r a r T i N e e a h u r y u o M K S 日 2 1 0 日 2 2 0 日 3 0 0 日 3 0 0 度 w ス l ま o 解 0 - u / い 製 e R 決 ナ 歴 登 0 : : 登 O 足 ら 登 0 : : 登 T 足 r S / d n y o u l t u e e r o c k * i r s t o r e t o e s i h l t y a e t f h x t f h a u a e - n M / I k 登 0 : : 登 T 足 r T o r e r n e M i o p e c o D p n s e u f C n e r e g t 登 0 : : 登 O 足 r E h u r t a s e G a p t i s t e b h e r t h e e c o g e o h s m R o e , t i o s s u n t b m n ? T o r r s h M l E 録 2 5 + 録 E 足 D o a u f o n I c n a s i o g s n a n r n e n 3 c I n w i t l e s 1 a t m I g e r s a n r e g t 登 0 : : 登 O 足 r E h u r t a p a c h r e 1 e e S f h p e w h n s i n o e a e a h a l M e P o t r 1 h u r y u o M K S 日 2 0 0 者 1 補 e m I r o e u l t e t d i e o r h q m M o g t t h s t a y m e R 1 s e m e t s t n d u a o k o b a s a E 録 2 1 + 録 W 足 D b a u f h s p T o r i t t o e r i I e y o a r a a q r v n t s n a w s f s p o f h S o s a c e A e v y l u a n w n r 4 f u n i t u d s f i T d n e t r F M e u t t r . T o r r s h M l E 録 2 0 + 録 E 足 D a a u f o p I u o t y w r y n o i I n i h v e b h a n F M e n c e e k s n e e s I o r t n t l y l g h t a d t R b 日 3 0 0 者 1 補 e r o a o o s r a e p i l M 3 I a e l i l M 4 o a s a E 録 2 2 + 録 W 足 D b a u f h s l T i n e c h u r y u o M K S 日 3 0 0 者 1 補 e r n y o u r u e l s t i s a E 録 2 0 + 録 W 足 * n s s *\n" +
                "]", data);
    }

    @Test
    public void forwardDirectionTest() {
        WordDirection sut = new WordDirection();
        String data = sut.forwardDirection("Prashant");
        assertEquals("Prashant", data);
    }

    @Test
    public void numberOfFirstWordsTest() {
        WordDirection sut = new WordDirection();
        String data = sut.numberOfFirstWords(2, "Prashant Murahari Murahari Chintu Chinnu ");
        assertEquals("Prashant Murahari", data);
    }

    @Test
    public void numberOfLastWordsTest() {
        WordDirection sut = new WordDirection();
        String data = sut.numberOfLastWords(2, "Prashant Murahari Murahari Chintu Chinnu");
        assertEquals("Chinnu Chintu", data);
    }

    @Test
    public void reverseDirectionTest() {
        WordDirection sut = new WordDirection();
        String data = sut.reverseDirection("Prashant Murahari Murahari Chintu Chinnu");
        assertEquals("Chinnu Chintu Murahari Murahari Prashant", data);
    }

    @Test
    public void firstLetterOfEachWordTest() {
        WordDirection sut = new WordDirection();
        String data = sut.firstLetterOfEachWord("Prashant Murahari Murahari Chintu Chinnu");
        assertEquals("P M M C C", data);
    }

    @Test
    public void incrementalPositionsTest() {
        WordDirection sut = new WordDirection();
        String data = sut.incrementalPositions("Prashant Murahari Murahari Chintu Chinnu", 5);
        assertEquals("P u r n n", data);
    }
    public void convertingToJsonTest(){
        JavaToJson javaToJson = new JavaToJson();
        String direction = javaToJson.getWordDirection();
        System.out.println();

    }

}