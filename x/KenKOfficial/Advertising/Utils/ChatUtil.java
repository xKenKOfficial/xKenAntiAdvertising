package x.KenKOfficial.Advertising.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] Il;
    
    private static String Il(final String IlIllIlllllllll, final String IIIllIlllllllll) {
        try {
            final SecretKeySpec IIIIIllllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.Il[8]), "DES");
            final Cipher IllllIlllllllll = Cipher.getInstance("DES");
            IllllIlllllllll.init(ChatUtil.Il[2], IIIIIllllllllll);
            return new String(IllllIlllllllll.doFinal(Base64.getDecoder().decode(IlIllIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIlllllllll) {
            IIlllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String I(String lllIllIllllllll, final String lIlIllIllllllll) {
        lllIllIllllllll = new String(Base64.getDecoder().decode(lllIllIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIllllIllllllll = new StringBuilder();
        final char[] llIlllIllllllll = lIlIllIllllllll.toCharArray();
        int lIIlllIllllllll = ChatUtil.Il[0];
        final byte llllIlIllllllll = (Object)lllIllIllllllll.toCharArray();
        final Exception lIllIlIllllllll = (Exception)llllIlIllllllll.length;
        String llIlIlIllllllll = (String)ChatUtil.Il[0];
        while (llIl((int)llIlIlIllllllll, (int)lIllIlIllllllll)) {
            final char IlIIIIlllllllll = llllIlIllllllll[llIlIlIllllllll];
            lIllllIllllllll.append((char)(IlIIIIlllllllll ^ llIlllIllllllll[lIIlllIllllllll % llIlllIllllllll.length]));
            "".length();
            ++lIIlllIllllllll;
            ++llIlIlIllllllll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lIllllIllllllll);
    }
    
    static {
        lIIl();
        lll();
    }
    
    private static String ll(final String lIllIllllllllll, final String IIllIllllllllll) {
        try {
            final SecretKeySpec lIlIlllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlllllllllll = Cipher.getInstance("Blowfish");
            IIlIlllllllllll.init(ChatUtil.Il[2], lIlIlllllllllll);
            return new String(IIlIlllllllllll.doFinal(Base64.getDecoder().decode(lIllIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlllllllllll) {
            IlIIlllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIl(final int llIllIIllllllll, final int IlIllIIllllllll) {
        return llIllIIllllllll < IlIllIIllllllll;
    }
    
    private static void lll() {
        (I = new String[ChatUtil.Il[8]])[ChatUtil.Il[0]] = I("Xw==", "yeBLN");
        ChatUtil.I[ChatUtil.Il[1]] = Il("e06L+18M7Io=", "TAtSv");
        ChatUtil.I[ChatUtil.Il[2]] = Il("WumN7JM3fYk=", "WyPJO");
        ChatUtil.I[ChatUtil.Il[3]] = I("w64=", "UJDWD");
        ChatUtil.I[ChatUtil.Il[4]] = ll("qyZEa9EX2f0=", "qaZws");
        ChatUtil.I[ChatUtil.Il[5]] = Il("0aRuyBXomxw=", "OOdCq");
        ChatUtil.I[ChatUtil.Il[6]] = I("PAAW", "GNkki");
        ChatUtil.I[ChatUtil.Il[7]] = I("bA==", "fJgWz");
    }
    
    public static String fixColor(final String llIllllllllllll) {
        return llIllllllllllll.replaceAll(ChatUtil.I[ChatUtil.Il[0]], ChatUtil.I[ChatUtil.Il[1]]).replace(ChatUtil.I[ChatUtil.Il[2]], ChatUtil.I[ChatUtil.Il[3]]).replace(ChatUtil.I[ChatUtil.Il[4]], ChatUtil.I[ChatUtil.Il[5]]).replace(ChatUtil.I[ChatUtil.Il[6]], ChatUtil.I[ChatUtil.Il[7]]);
    }
    
    private static void lIIl() {
        (Il = new int[9])[0] = ((0x34 ^ 0x2) & ~(0x29 ^ 0x1F));
        ChatUtil.Il[1] = " ".length();
        ChatUtil.Il[2] = "  ".length();
        ChatUtil.Il[3] = "   ".length();
        ChatUtil.Il[4] = (10 + 98 - 20 + 40 ^ 48 + 20 + 42 + 22);
        ChatUtil.Il[5] = (0x20 ^ 0x2B ^ (0x5C ^ 0x52));
        ChatUtil.Il[6] = (0x7E ^ 0x78);
        ChatUtil.Il[7] = (132 + 74 - 121 + 61 ^ 111 + 91 - 88 + 35);
        ChatUtil.Il[8] = (0xF3 ^ 0x8B ^ (0xF7 ^ 0x87));
    }
}
