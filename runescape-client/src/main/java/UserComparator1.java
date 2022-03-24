import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnc;Lnc;I)I", garbageValue = 
	"-471042095")

	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((User) (var1)), ((User) (var2)));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-889372526")

	public static void method8029() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}
}