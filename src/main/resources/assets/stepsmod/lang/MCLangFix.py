woodVariants = ["spruce_planks","birch_planks","jungle_planks","acacia_planks"\
                ,"dark_oak_planks","crimson_planks","warped_planks"]

stoneVariants = ["stone","granite","polished_granite","diorite","polished_diorite"\
    ,"andesite","polished_andesite","mossy_cobblestone","stone_brick","mossy_stone_brick"]

copperVariants = ["cut_copper","exposed_cut_copper","weathered_cut_copper","oxidized_cut_copper","waxed_cut_copper","waxed_exposed_cut_copper"\
    ,"waxed_weathered_cut_copper","waxed_oxidized_cut_copper"]

with open("en_us.json","r") as in_file:
    contents = in_file.readlines()

linetostart = contents.index("  \"REPLACEME\":\"test\",\n")
for line in contents:
    print(line)

for copper in copperVariants:
    toinsert = "  \"block.stepsmod."+copper+"_steps\": "
    nameofcopper = "\""+copper.title().replace("_"," ")
    toinsert = toinsert + nameofcopper + " Steps\",\n"
    contents.insert(linetostart,toinsert)

with open("en_us.json","w") as in_file:
    contents = "".join(contents)
    in_file.write(contents)
            
