package x.KenKOfficial.Advertising.Listeners;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Advertising.Main.*;
import x.KenKOfficial.Advertising.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String[] IIl;
    
    static {
        lIIIl();
        IIIIl();
    }
    
    private static String lIll(String IlIIIllIlllllll, final String lIIIIllIlllllll) {
        IlIIIllIlllllll = new String(Base64.getDecoder().decode(IlIIIllIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlIIllIlllllll = new StringBuilder();
        final char[] IIlIIllIlllllll = lIIIIllIlllllll.toCharArray();
        int llIIIllIlllllll = PlayerJoin.lIl[0];
        final String lIlllIlIlllllll = (Object)IlIIIllIlllllll.toCharArray();
        final String IIlllIlIlllllll = (String)lIlllIlIlllllll.length;
        int llIllIlIlllllll = PlayerJoin.lIl[0];
        while (llIIl(llIllIlIlllllll, (int)IIlllIlIlllllll)) {
            final char IIIlIllIlllllll = lIlllIlIlllllll[llIllIlIlllllll];
            lIlIIllIlllllll.append((char)(IIIlIllIlllllll ^ IIlIIllIlllllll[llIIIllIlllllll % IIlIIllIlllllll.length]));
            "".length();
            ++llIIIllIlllllll;
            ++llIllIlIlllllll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lIlIIllIlllllll);
    }
    
    private static boolean IlIIl(final int IlIlllIIlllllll) {
        return IlIlllIIlllllll != 0;
    }
    
    private static void lIIIl() {
        (lIl = new int[14])[0] = ((0x49 ^ 0x77 ^ (0xA ^ 0xD)) & (54 + 60 + 37 + 101 ^ 43 + 98 - 0 + 56 ^ -" ".length()));
        PlayerJoin.lIl[1] = " ".length();
        PlayerJoin.lIl[2] = "  ".length();
        PlayerJoin.lIl[3] = "   ".length();
        PlayerJoin.lIl[4] = (21 + 17 - 14 + 140 ^ 34 + 34 + 41 + 51);
        PlayerJoin.lIl[5] = (181 + 126 - 216 + 101 ^ 72 + 39 - 27 + 113);
        PlayerJoin.lIl[6] = (0x16 ^ 0x10);
        PlayerJoin.lIl[7] = (0xA4 ^ 0xA3);
        PlayerJoin.lIl[8] = (9 + 43 + 41 + 56 ^ 83 + 0 + 15 + 59);
        PlayerJoin.lIl[9] = (0xEC ^ 0xA8 ^ (0x1D ^ 0x50));
        PlayerJoin.lIl[10] = (0x2 ^ 0x70 ^ (0x2E ^ 0x56));
        PlayerJoin.lIl[11] = (0x59 ^ 0x1D ^ (0xF9 ^ 0xB6));
        PlayerJoin.lIl[12] = (0x52 ^ 0x5E);
        PlayerJoin.lIl[13] = (0xA7 ^ 0xAA);
    }
    
    private static String llll(final String lIlIIIlIlllllll, final String IIlIIIlIlllllll) {
        try {
            final SecretKeySpec IIIlIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lIl[8]), "DES");
            final Cipher lllIIIlIlllllll = Cipher.getInstance("DES");
            lllIIIlIlllllll.init(PlayerJoin.lIl[2], IIIlIIlIlllllll);
            return new String(lllIIIlIlllllll.doFinal(Base64.getDecoder().decode(lIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIIIlIlllllll) {
            IllIIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent lIlIlllIlllllll) {
        final Player IIlIlllIlllllll = lIlIlllIlllllll.getPlayer();
        if (IlIIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIl[PlayerJoin.lIl[0]]) ? 1 : 0) && IlIIl(IIlIlllIlllllll.hasPermission(PlayerJoin.IIl[PlayerJoin.lIl[1]]) ? 1 : 0)) {
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[2]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[3]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[4]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[5]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[6]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[7]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIl[PlayerJoin.lIl[8]]).append(Bukkit.getBukkitVersion()))));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[9]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[10]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[11]]));
            IIlIlllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[12]]));
        }
    }
    
    private static void IIIIl() {
        (IIl = new String[PlayerJoin.lIl[13]])[PlayerJoin.lIl[0]] = lIll("Gx8zFQUFLC8cCgQ=", "ksFrl");
        PlayerJoin.IIl[PlayerJoin.lIl[1]] = Illl("RvZ2Vjth8L4NrZ/IXqx98TDZ/OrMADp+eVuKlTYDu6C0Y6UQD6b8+w==", "UeeAX");
        PlayerJoin.IIl[PlayerJoin.lIl[2]] = lIll("dn50HHpte29Nem17b016bXtvTRx2dXQcPxsjPDEpJC8TFDE1NCYZNDkoNVZ/dioPTXpte29Nem17b016bXtv", "PFRpG");
        PlayerJoin.IIl[PlayerJoin.lIl[3]] = lIll("aQ==", "IieBK");
        PlayerJoin.IIl[PlayerJoin.lIl[4]] = llll("y6xAY/Oh8ZjxMo/k9eqjmp2wQXGuQN200FW5dRs53n7ZU40R9dP/fg==", "bFPkQ");
        PlayerJoin.IIl[PlayerJoin.lIl[5]] = llll("tU6J4sCsWQE=", "rAnNh");
        PlayerJoin.IIl[PlayerJoin.lIl[6]] = Illl("GV/qW/mCAmXsE1tE9WafXzsQ7lSgkhYD", "rLNZw");
        PlayerJoin.IIl[PlayerJoin.lIl[7]] = Illl("alRoFwOQQ98=", "xpkta");
        PlayerJoin.IIl[PlayerJoin.lIl[8]] = Illl("+FmyJwLzoD8GwCD5aI8f7fu16LfjY+c+gbkdNTAHlbI=", "arCeo");
        PlayerJoin.IIl[PlayerJoin.lIl[9]] = llll("ZSDOlr7zE8U=", "roNBI");
        PlayerJoin.IIl[PlayerJoin.lIl[10]] = Illl("/bdtuyrlIax6SSdDIAKCqYFLLj0iIzOZ/qcpAtXGKHFUdorDpozeNYmxR45uGQRueIVCCGXyj6k=", "DoGZc");
        PlayerJoin.IIl[PlayerJoin.lIl[11]] = Illl("jrlEl3MAEvw=", "PYxKa");
        PlayerJoin.IIl[PlayerJoin.lIl[12]] = Illl("CPVpVYKtP1WvVsSEA6+h5V+t3C73kObQtHs1lx3AnrDnCDPDu19TMI2kThsP688er1bEhAOvoeVUywXDwXRnRw==", "hfxqC");
    }
    
    private static boolean llIIl(final int lIllllIIlllllll, final int IIllllIIlllllll) {
        return lIllllIIlllllll < IIllllIIlllllll;
    }
    
    private static String Illl(final String IlIIlIlIlllllll, final String llllIIlIlllllll) {
        try {
            final SecretKeySpec lIlIlIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlIlIlllllll = Cipher.getInstance("Blowfish");
            IIlIlIlIlllllll.init(PlayerJoin.lIl[2], lIlIlIlIlllllll);
            return new String(IIlIlIlIlllllll.doFinal(Base64.getDecoder().decode(IlIIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIlllllll) {
            llIIlIlIlllllll.printStackTrace();
            return null;
        }
    }
}
