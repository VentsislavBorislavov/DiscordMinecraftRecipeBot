import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    private static final String TOKEN = "NzQ1MjYxMzcwMDEzOTA5MDcy.XzvMvA.MlLSmRB3KavJyuEtQYR37hh3tpc";

    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault(TOKEN).build();
        jda.addEventListener(new MessageEvent());
    }
}
