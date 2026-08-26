package wily.legacy.client;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.resources.Identifier;
import wily.factoryapi.FactoryAPI;
import wily.factoryapi.util.ListMap;

import java.util.Locale;

public class CommonColor extends CommonValue<Integer> {
    public static final Codec<Integer> RGBA_INT_COLOR_CODEC = Codec.STRING.comapFlatMap((string) -> {
        if (!string.startsWith("#")) {
            return DataResult.error(() -> "Not a color code: " + string);
        } else {
            try {
                int i = (int) Long.parseLong(string.substring(1), 16);
                return DataResult.success(i);
            } catch (NumberFormatException var2) {
                return DataResult.error(() -> "Exception parsing color code: " + var2.getMessage());
            }
        }
    }, i -> String.format(Locale.ROOT, "#%08X", i));
    public static final Codec<Integer> INT_COLOR_CODEC = Codec.either(RGBA_INT_COLOR_CODEC, Codec.INT).xmap(e -> e.map(i -> i, i -> i), Either::left);

    public static final ListMap<Identifier, CommonColor> COMMON_COLORS = new ListMap<>();

    public static final CommonColor CHAT_BACKGROUND = registerCommonColor("chat_background", 0xFF323232);
    public static final CommonColor CHAT_TEXT = registerCommonColor("chat_text", 0xFFFFFFFF);
    public static final CommonColor GRAY_TEXT = registerCommonColor("inventory_gray_text", 0xFF323232);
    public static final CommonColor WIDGET_TEXT = registerCommonColor("widget_text", 0xFFFFFFFF);
    public static final CommonColor WIDGET_TEXT_SHADOW = registerCommonColor("widget_text_shadow", 0xFF000000);
    public static final CommonColor HIGHLIGHTED_WIDGET_TEXT = registerCommonColor("highlighted_widget_text", 0xFFFFFF00);
    public static final CommonColor TITLE_TEXT = registerCommonColor("title_text", 0xFFFFFFFF);
    public static final CommonColor TITLE_TEXT_OUTLINE = registerCommonColor("title_text_outline", 0xFF000000);
    public static final CommonColor TITLE_TEXT_OUTLINE_DOWN = registerCommonColor("title_text_outline_down", 0xFF000000);
    public static final CommonColor STAGE_TEXT = registerCommonColor("stage_text", 0xFFFFFFFF);
    public static final CommonColor TIP_TITLE_TEXT = registerCommonColor("tip_title_text", 0xFFFFFFFF);
    public static final CommonColor TIP_TEXT = registerCommonColor("tip_text", 0xFFFFFFFF);
    public static final CommonColor ACTION_TEXT = registerCommonColor("action_text", 0xFFFFFFFF);
    public static final CommonColor ITEM_NAME_TEXT = registerCommonColor("item_name_text", 0xFFFFFFFF);
    public static final CommonColor ITEM_TOOLTIP_TEXT = registerCommonColor("item_tooltip_text", 0xFFFFFFFF);
    public static final CommonColor MAP_COORDINATE_TEXT = registerCommonColor("map_coordinate_text", 0xFF000000);
    public static final CommonColor DEATH_MESSAGE_TEXT = registerCommonColor("death_message_text", 0xFFFFFFFF);
    public static final CommonColor BOSS_TEXT = registerCommonColor("boss_text", 0xFFFFFFFF);
    public static final CommonColor SELECTED_STORAGE_SAVE = registerCommonColor("selected_storage_save", 0xFFFFFF00);
    public static final CommonColor STORAGE_SAVE = registerCommonColor("storage_save", 0xFF8C9DE2);
    public static final CommonColor EXPERIENCE_TEXT = registerCommonColor("experience_text", 0xFF80FF20);
    public static final CommonColor INSUFFICIENT_EXPERIENCE_TEXT = registerCommonColor("insufficient_experience_text", 0xFFCF1F1D);
    public static final CommonColor ANVIL_ERROR_TEXT = registerCommonColor("anvil_error_text", 0xFFFF6060);
    public static final CommonColor ENCHANTMENT_TEXT = registerCommonColor("enchantment_text", 0xFF685E4A);
    public static final CommonColor ENCHANTMENT_LANGUAGE_TEXT = registerCommonColor("enchantment_language_text", 0xFF685E4A);
    public static final CommonColor INVALID_ENCHANTMENT_TEXT = registerCommonColor("invalid_enchantment_text", 0xFF383222);
    public static final CommonColor HIGHLIGHTED_ENCHANTMENT_TEXT = registerCommonColor("highlighted_enchantment_text", 0xFFFFFF80);
    public static final CommonColor BLACK = registerCommonColor("black", 0xFF000000);
    public static final CommonColor DARK_BLUE = registerCommonColor("dark_blue", 0xFF0000AA);
    public static final CommonColor DARK_GREEN = registerCommonColor("dark_green", 0xFF00AA00);
    public static final CommonColor DARK_AQUA = registerCommonColor("dark_aqua", 0xFF00AAAA);
    public static final CommonColor DARK_RED = registerCommonColor("dark_red", 0xFFAA0000);
    public static final CommonColor DARK_PURPLE = registerCommonColor("dark_purple", 0xFFAA00AA);
    public static final CommonColor GOLD = registerCommonColor("gold", 0xFFFFAA00);
    public static final CommonColor GRAY = registerCommonColor("gray", 0xFFAAAAAA);
    public static final CommonColor DARK_GRAY = registerCommonColor("dark_gray", 0xFF555555);
    public static final CommonColor BLUE = registerCommonColor("blue", 0xFF7878ff);
    public static final CommonColor GREEN = registerCommonColor("green", 0xFF55FF55);
    public static final CommonColor AQUA = registerCommonColor("aqua", 0xFF55FFFF);
    public static final CommonColor RED = registerCommonColor("red", 0xFFFF5555);
    public static final CommonColor LIGHT_PURPLE = registerCommonColor("light_purple", 0xFFFF55FF);
    public static final CommonColor YELLOW = registerCommonColor("yellow", 0xFFFFFF55);
    public static final CommonColor WHITE = registerCommonColor("white", 0xFFFFFFFF);
    public static final CommonColor BLOCK_LIGHT = registerCommonColor("block_light", 0xFFFFD88C);

    public static final CommonColor HTML_COLOR_0 = registerCommonColor("html_color_0", 0xFF000000);
    public static final CommonColor HTML_COLOR_1 = registerCommonColor("html_color_1", 0xFF0000AA);
    public static final CommonColor HTML_COLOR_2 = registerCommonColor("html_color_2", 0xFF109E10);
    public static final CommonColor HTML_COLOR_3 = registerCommonColor("html_color_3", 0xFF109E9E);
    public static final CommonColor HTML_COLOR_4 = registerCommonColor("html_color_4", 0xFFAA0000);
    public static final CommonColor HTML_COLOR_5 = registerCommonColor("html_color_5", 0xFFDE5BD9);
    public static final CommonColor HTML_COLOR_6 = registerCommonColor("html_color_6", 0xFFFFAA00);
    public static final CommonColor HTML_COLOR_7 = registerCommonColor("html_color_7", 0xFFAAAAAA);
    public static final CommonColor HTML_COLOR_8 = registerCommonColor("html_color_8", 0xFF555555);
    public static final CommonColor HTML_COLOR_9 = registerCommonColor("html_color_9", 0xFF7878FF);
    public static final CommonColor HTML_COLOR_A = registerCommonColor("html_color_a", 0xFF55FF55);
    public static final CommonColor HTML_COLOR_B = registerCommonColor("html_color_b", 0xFF55FFFF);
    public static final CommonColor HTML_COLOR_C = registerCommonColor("html_color_c", 0xFFFF5555);
    public static final CommonColor HTML_COLOR_D = registerCommonColor("html_color_d", 0xFFFF55FF);
    public static final CommonColor HTML_COLOR_E = registerCommonColor("html_color_e", 0xFFFFFF55);
    public static final CommonColor HTML_COLOR_F = registerCommonColor("html_color_f", 0xFFFFFFFF);
    public static final CommonColor COLOR_ITEM_COUNT = registerCommonColor("color_item_count", 0xFFFFFFFF);
    public static final CommonColor HTML_COLOR_DARK_0 = registerCommonColor("html_color_dark_0", 0xFF000000);
    public static final CommonColor HTML_COLOR_DARK_1 = registerCommonColor("html_color_dark_1", 0xFF00002A);
    public static final CommonColor HTML_COLOR_DARK_2 = registerCommonColor("html_color_dark_2", 0xFF002A00);
    public static final CommonColor HTML_COLOR_DARK_3 = registerCommonColor("html_color_dark_3", 0xFF002A2A);
    public static final CommonColor HTML_COLOR_DARK_4 = registerCommonColor("html_color_dark_4", 0xFF2A0000);
    public static final CommonColor HTML_COLOR_DARK_5 = registerCommonColor("html_color_dark_5", 0xFF2A002A);
    public static final CommonColor HTML_COLOR_DARK_6 = registerCommonColor("html_color_dark_6", 0xFF2A2A00);
    public static final CommonColor HTML_COLOR_DARK_7 = registerCommonColor("html_color_dark_7", 0xFF2A2A2A);
    public static final CommonColor HTML_COLOR_DARK_8 = registerCommonColor("html_color_dark_8", 0xFF151515);
    public static final CommonColor HTML_COLOR_DARK_9 = registerCommonColor("html_color_dark_9", 0xFF15153F);
    public static final CommonColor HTML_COLOR_DARK_A = registerCommonColor("html_color_dark_a", 0xFF153F15);
    public static final CommonColor HTML_COLOR_DARK_B = registerCommonColor("html_color_dark_b", 0xFF153F3F);
    public static final CommonColor HTML_COLOR_DARK_C = registerCommonColor("html_color_dark_c", 0xFF3F1515);
    public static final CommonColor HTML_COLOR_DARK_D = registerCommonColor("html_color_dark_d", 0xFF3F153F);
    public static final CommonColor HTML_COLOR_DARK_E = registerCommonColor("html_color_dark_e", 0xFF3F3F15);
    public static final CommonColor HTML_COLOR_DARK_F = registerCommonColor("html_color_dark_f", 0xFF3F3F3F);
    public static final CommonColor COLOR_ENCHANT_TEXT_FOCUS = registerCommonColor("color_item_count", 0xFFFFFF80);
    public static final CommonColor HTML_COLOR_T1 = registerCommonColor("html_color_t1", 0xFFC81E1E);
    public static final CommonColor HTML_COLOR_T2 = registerCommonColor("html_color_t2", 0xFF1C60D6);
    public static final CommonColor HTML_COLOR_T3 = registerCommonColor("html_color_t3", 0xFF2A9524);
    public static final CommonColor HTML_COLOR_BLACK = registerCommonColor("html_color_black", 0xFF323232);
    public static final CommonColor HTML_COLOR_WHITE = registerCommonColor("html_color_white", 0xFFEBEBEB);
    public static final CommonColor COLOR_ENCHANT_TEXT = registerCommonColor("color_item_count", 0xFF685E4A);
    public static final CommonColor COLOR_ENCHANT_TEXT_DISABLED = registerCommonColor("enchant_text_disabled", 0xFF342F25);
    public static final CommonColor COLOR_RENAMED_ITEM_TITLE = registerCommonColor("renamed_item_tile", 0xFFFFB82E);

    public CommonColor(Integer obj) {
        super(obj, INT_COLOR_CODEC);
    }

    public static CommonColor registerCommonColor(String path, int defaultValue) {
        return registerCommonColor(FactoryAPI.createVanillaLocation(path), defaultValue);
    }

    public static CommonColor registerCommonColor(Identifier id, int defaultValue) {
        CommonColor color = new CommonColor(defaultValue);
        COMMON_COLORS.put(id, color);
        return color;
    }
}
