package x.KenKOfficial.Advertising.Listeners;

import java.nio.charset.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Advertising.Main.*;
import org.bukkit.*;
import x.KenKOfficial.Advertising.Utils.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class AsyncPlayerChat implements Listener
{
    private static final /* synthetic */ String COSNOLE_COMMAND;
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String REASON;
    private static final /* synthetic */ String[] l;
    
    private static String IIl(String IllIIlIllllllll, final String IIllIlIllllllll) {
        IllIIlIllllllll = (double)new String(Base64.getDecoder().decode(((String)IllIIlIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIlIlIllllllll = new StringBuilder();
        final char[] IIIlIlIllllllll = IIllIlIllllllll.toCharArray();
        int lllIIlIllllllll = AsyncPlayerChat.ll[0];
        final short lIIIIlIllllllll = (Object)((String)IllIIlIllllllll).toCharArray();
        final long lllllIIllllllll = lIIIIlIllllllll.length;
        String lIlllIIllllllll = (String)AsyncPlayerChat.ll[0];
        while (IIll((int)lIlllIIllllllll, (int)lllllIIllllllll)) {
            final char IIIIllIllllllll = lIIIIlIllllllll[lIlllIIllllllll];
            IlIlIlIllllllll.append((char)(IIIIllIllllllll ^ IIIlIlIllllllll[lllIIlIllllllll % IIIlIlIllllllll.length]));
            "".length();
            ++lllIIlIllllllll;
            ++lIlllIIllllllll;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIlIlIllllllll);
    }
    
    @EventHandler
    public void onCensure(final AsyncPlayerChatEvent lIlIlIlllllllll) {
        final Player lIIllIlllllllll = lIlIlIlllllllll.getPlayer();
        final List<String> lllIlIlllllllll = (List<String>)Main.getPlugin().getConfig().getStringList(AsyncPlayerChat.l[AsyncPlayerChat.ll[0]]);
        final String llllIIlllllllll = (String)lllIlIlllllllll.iterator();
        while (IlIl(((Iterator)llllIIlllllllll).hasNext() ? 1 : 0)) {
            final String lllllIlllllllll = ((Iterator<String>)llllIIlllllllll).next();
            if (IlIl(lIlIlIlllllllll.getMessage().toLowerCase().contains(lllllIlllllllll.toLowerCase()) ? 1 : 0)) {
                if (IlIl(lIIllIlllllllll.hasPermission(AsyncPlayerChat.l[AsyncPlayerChat.ll[1]]) ? 1 : 0)) {
                    return;
                }
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), ChatUtil.fixColor(AsyncPlayerChat.COSNOLE_COMMAND.replace(AsyncPlayerChat.l[AsyncPlayerChat.ll[2]], lIIllIlllllllll.getName()).replace(AsyncPlayerChat.l[AsyncPlayerChat.ll[3]], AsyncPlayerChat.REASON)));
                "".length();
                lIlIlIlllllllll.setCancelled((boolean)(AsyncPlayerChat.ll[1] != 0));
            }
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
    }
    
    private static boolean IlIl(final int IIlllllIlllllll) {
        return IIlllllIlllllll != 0;
    }
    
    private static void Ill() {
        (l = new String[AsyncPlayerChat.ll[6]])[AsyncPlayerChat.ll[0]] = l("KTOUpeBblguJY6+GcGzEDxyKE1tENHfG", "xyRRN");
        AsyncPlayerChat.l[AsyncPlayerChat.ll[1]] = IIl("HS4WPSQLMRoyIRMgAScsFiwdNGsEIR46K0skHScsBiAdIDAXIA==", "eEsSE");
        AsyncPlayerChat.l[AsyncPlayerChat.ll[2]] = lIl("S+MNXNw6w8vXrGcP8Ffr6A==", "iaQDa");
        AsyncPlayerChat.l[AsyncPlayerChat.ll[3]] = IIl("Gjs8CTcuJwQ=", "aiyHd");
        AsyncPlayerChat.l[AsyncPlayerChat.ll[4]] = l("uew2fOdQHA7si/enAT+HaA==", "sbwJR");
        AsyncPlayerChat.l[AsyncPlayerChat.ll[5]] = lIl("S76lbB6ziDw=", "rrnpE");
    }
    
    private static void IIIl() {
        (ll = new int[8])[0] = ((0x5E ^ 0x58 ^ (0x7B ^ 0x4D)) & (0x6C ^ 0x49 ^ (0x6 ^ 0x13) ^ -" ".length()));
        AsyncPlayerChat.ll[1] = " ".length();
        AsyncPlayerChat.ll[2] = "  ".length();
        AsyncPlayerChat.ll[3] = "   ".length();
        AsyncPlayerChat.ll[4] = (0x35 ^ 0x20 ^ (0x2 ^ 0x13));
        AsyncPlayerChat.ll[5] = (51 + 132 - 77 + 31 ^ 23 + 130 - 86 + 73);
        AsyncPlayerChat.ll[6] = (0x2D ^ 0x1A ^ (0x4D ^ 0x7C));
        AsyncPlayerChat.ll[7] = (127 + 87 - 162 + 82 ^ 3 + 118 - 111 + 132);
    }
    
    private static String lIl(final String IlIIlIIllllllll, final String lIIIlIIllllllll) {
        try {
            final SecretKeySpec lllIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIllllllll.getBytes(StandardCharsets.UTF_8)), AsyncPlayerChat.ll[7]), "DES");
            final Cipher IllIlIIllllllll = Cipher.getInstance("DES");
            IllIlIIllllllll.init(AsyncPlayerChat.ll[2], lllIlIIllllllll);
            return new String(IllIlIIllllllll.doFinal(Base64.getDecoder().decode(IlIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIllllllll) {
            lIlIlIIllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIIl();
        Ill();
        COSNOLE_COMMAND = Main.getPlugin().getConfig().getString(AsyncPlayerChat.l[AsyncPlayerChat.ll[4]]);
        REASON = Main.getPlugin().getConfig().getString(AsyncPlayerChat.l[AsyncPlayerChat.ll[5]]);
    }
    
    private static String l(final String lllIIIIllllllll, final String IIlIIIIllllllll) {
        try {
            final SecretKeySpec IlIlIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIlIIIllllllll = Cipher.getInstance("Blowfish");
            lIIlIIIllllllll.init(AsyncPlayerChat.ll[2], IlIlIIIllllllll);
            return new String(lIIlIIIllllllll.doFinal(Base64.getDecoder().decode(lllIIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIIIllllllll) {
            IIIlIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIll(final int lllllllIlllllll, final int IllllllIlllllll) {
        return lllllllIlllllll < IllllllIlllllll;
    }
}
