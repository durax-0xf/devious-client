import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("Node")
public class Node {
	@ObfuscatedName("gf")
	@Export("key")
	public long key;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	@Export("previous")
	public Node previous;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	@Export("next")
	public Node next;

	@ObfuscatedName("ft")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fo")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}