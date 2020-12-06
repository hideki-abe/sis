/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author ocmma
 */
public enum CodigoIATA {
    SBAM("Amap�/AP"),
	SWYN("Apu�/AM"),
	APQ("Arapiraca/AL"),
	BAZ("Barcelos/AM"),
 	SWBI("Barreirinha/AM"),
 	BEL("Bel�m/PA"),
 	CNF("Confins/MG"),
 	PLU("Belo Horizonte/MG"),
 	SWBR("Borba/AM"),
 	SWBS("Brasileia/AC"),
 	BSB("Lago Sul/DF"),
 	SNCC("Cal�oene/AP"),
 	VCP("Campinas/SP"),
 	CPQ("Campinas/SP"),
 	SBMT("S�o Paulo/SP"),
 	CAU("Caruaru/PE"),
 	CAF("Caraurari/AM"),
 	CAC("Cascavel/PR"),
 	SILQ("Cascavel/PR"),
 	CIZ("Coari/AM"),
 	CDJ("Conceiss�o do Araguaia/PA"),
 	CZS("Cruzeiro do Sul/AC"),
 	BFH("Curitiba/PR"),
 	CWB("S�o Jos� dos Pinhais/PR"),
 	FEJ("Feij�/AC"),
 	SWFN("Manaus/AM"),
 	FLN("Florian�polis/SC"),
 	FOR("Fortaleza/CE"),
 	IGU("Foz do Igua�u/PR"),
 	IZA("Goian�/MG "),
 	GYN("Goi�nia/GO"),
 	GRU("Guarulhos/SP"),
 	IMP("Imperatriz/MA"),
 	JJD("Cruz/CE"),
 	JOI("Joinville/SC"),
 	JPA("Bayeux/PB"),
 	JDF("Juiz de Fora/MG"),
 	QDV("Jundia�/SP"),
 	MCP("Macap�/AP"),
	MAO("Manaus/AM"),
	SNML("Rio Largo/A L"),
	MCZ("Rio Largo/AL"),
	MVF("Mossor�/RN"),
	NVT("Navegantes/SC"),
	NAT("S�oo Gon�alo do Amarante/RN"),
	SWNK("Boca do Acre/AM"),
	SBOI("Oiapoque/AP"),
	SNOZ("Pa�o do Lumiar/MA"),
	SWJV("Atalaia do Norte/AM"),
	PHB("Parna�ba�ba/PI"),
	SNPE("Penedo/AL"),
	PGZ("Ponta Grossa/PR"),
	POA("Porto Alegre/RS"),
	SNPG("Porto Grande/AP"),
	REC("Recife/PE"),
	RAO("Ribeir�o Preto/SP"),
	RBR("Rio Branco/AC"),
 	SDU("Rio de Janeiro/RJ"),
 	GIG("Rio de Janeiro/RJ"),
 	SBJR("Rio de Janeiro/RJ"),
 	ROO("Rondon�polis/MT"),
 	RIA("Santa Maria/RS"),
 	SDOE("Santa Rosa do Purus/AC"),
 	SSZ("Guaruj�/SP"),
 	QSC("S�o Carlos/SP"),
 	SLZ("S�oo Lu�s/MA"),
 	CGH("S�o Paulo/SP"),
 	ZMD("Sena Madureira/AC"),
 	SOD("Sorocaba/SP"),
 	SWMU("Pacaraima/RR"),
 	TBT("Tabatinga/AM"),
 	TRQ("Taraucá/AC"),
 	TFF("Tef�/AM"),
 	THE("Teresina/PI"),
 	SBTS("�bidos/PA"),
 	SNUN("Una�/MG"),
 	SWXU("Xapuri/AC");
        
    private final String cidade;
    CodigoIATA(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
    

}
