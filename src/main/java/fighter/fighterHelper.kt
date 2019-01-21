package fighter

import archetype.Archetype
import archetype.Mage
import archetype.Rogue
import archetype.Warrior

class FighterHelper {

    fun convertDtoToFighter(dto: FighterDTO): Fighter {
        val name = dto.name
        val desc = dto.description

        val archetype = getArchetypeFromName(dto.archetype)

        return Fighter(name, desc, archetype)
    }

    private fun getArchetypeFromName(name: String): Archetype {
        return when (name) {
            "Mage" -> Mage()
            "Warrior" -> Warrior()
            "Rogue" -> Rogue()
            else -> throw ClassNotFoundException(name)
        }
    }
}