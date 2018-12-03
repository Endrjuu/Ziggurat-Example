package io.github.thatkawaiisam.zigguratexample;

import io.github.thatkawaiisam.ziggurat.Ziggurat;
import io.github.thatkawaiisam.ziggurat.ZigguratAdapter;
import io.github.thatkawaiisam.ziggurat.ZigguratCommons;
import io.github.thatkawaiisam.ziggurat.utils.BufferedTabObject;
import io.github.thatkawaiisam.ziggurat.utils.TabColumn;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Set;

public class ZigguratExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new Ziggurat(this, new ZigguratAdapter() {
            @Override
            public Set<BufferedTabObject> getSlots(Player player) {
                Set<BufferedTabObject> toReturn = new HashSet<>();

                //Top Left hand corner
                toReturn.add(
                        new BufferedTabObject()
                                //Text
                                .text("&a&lThis is in Slot 1")
                                //Column
                                .column(TabColumn.LEFT)
                                //Slot
                                .slot(1)
                                //Ping (little buggy with 1.7 clients but defaults to 0 if thats the case
                                .ping(999)
                                //Texture (need to get skin sig and key
                                .skin(ZigguratCommons.defaultTexture)
                );

                return toReturn;
            }

            @Override
            public String getFooter() {
                return null;
            }

            @Override
            public String getHeader() {
                return null;
            }
        });
    }
}
