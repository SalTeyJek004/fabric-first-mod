woodVariants = ["spruce_planks","birch_planks","jungle_planks","acacia_planks"\
                ,"dark_oak_planks","crimson_planks","warped_planks"]

stoneVariants = ["stone","granite","polished_granite","diorite","polished_diorite"\
    ,"andesite","polished_andesite","mossy_cobblestone","stone_brick","mossy_stone_brick"]

with open("en_us.json","r") as in_file:
    contents = in_file.readlines()

linetostart = contents.index("  \"REPLACEME\":\"test\",\n")
for line in contents:
    print(line)

for stone in stoneVariants:
    toinsert = "  \"block.stepsmod."+stone+"_steps\": "
    nameofstone = "\""+stone.title().replace("_"," ")
    toinsert = toinsert + nameofstone + " Steps\",\n"
    contents.insert(linetostart,toinsert)

with open("en_us.json","w") as in_file:
    contents = "".join(contents)
    in_file.write(contents)
            
