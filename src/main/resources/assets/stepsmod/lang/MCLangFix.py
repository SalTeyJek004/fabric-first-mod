woodVariants = ["spruce_planks","birch_planks","jungle_planks","acacia_planks"\
                ,"dark_oak_planks","crimson_planks","warped_planks"]

with open("en_us.json","r") as in_file:
    contents = in_file.readlines()

linetostart = contents.index("  \"REPLACEME\":\"test\",\n")
for line in contents:
    print(line)

for wood in woodVariants:
    toinsert = "  \"block.stepsmod."+wood+"\": "
    nameofwood = "\""+wood.title().replace("_"," ")
    toinsert = toinsert + nameofwood + " Steps\",\n"
    contents.insert(linetostart,toinsert)

with open("en_us.json","w") as in_file:
    contents = "".join(contents)
    in_file.write(contents)
            
