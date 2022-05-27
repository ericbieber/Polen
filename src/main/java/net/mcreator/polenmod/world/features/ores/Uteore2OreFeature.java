
package net.mcreator.polenmod.world.features.ores;

public class Uteore2OreFeature extends OreFeature {

	public static final Uteore2OreFeature FEATURE = (Uteore2OreFeature) new Uteore2OreFeature().setRegistryName("polen_mod:uteore_2_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(Uteore2OreFeatureRuleTest.INSTANCE, PolenModModBlocks.UTEORE_2_ORE.defaultBlockState(), 7))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)))).squared().count(11);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public Uteore2OreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class Uteore2OreFeatureRuleTest extends RuleTest {

		static final Uteore2OreFeatureRuleTest INSTANCE = new Uteore2OreFeatureRuleTest();
		static final com.mojang.serialization.Codec<Uteore2OreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<Uteore2OreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("polen_mod:uteore_2_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
