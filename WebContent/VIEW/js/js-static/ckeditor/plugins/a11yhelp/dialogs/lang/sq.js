﻿/**
 * @license Copyright (c) 2003-2020, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or https://ckeditor.com/legal/ckeditor-oss-license
 */

CKEDITOR.plugins.setLang( 'a11yhelp', 'sq', {
	title: 'Udhëzimet e Qasjes',
	contents: 'Përmbajtja ndihmëse. Për ta mbyllur dialogun shtyp ESC.',
	legend: [
		{
		name: 'Të përgjithshme',
		items: [
			{
			name: 'Shiriti i Redaktuesit',
			legend: 'Shtyp ${toolbarFocus} për të shfletuar kokështrirjen. Kalo tek grupi paraprak ose pasues i shiritit përmes kombinacionit TAB dhe SHIFT+TAB, në tastierë. Kalo tek pulla paraprake ose pasuese e kokështrirjes përmes SHIGJETË DJATHTAS ose SHIGJETËS MAJTAS, në tastierë. Shtyp HAPËSIRË ose ENTER Move to the next and previous toolbar button with RIGHT ARROW për të aktivizuar pullën e kokështrirjes.'
		},

			{
			name: 'Dialogu i Redaktuesit',
			legend:
				'Në brendi të dialogut, shtyp TAB për të kaluar tek elementi tjetër i dialogut, shtyp SHIFT+TAB për të kaluar tek elementi paraprak i dialogut, shtyp ENTER për të shtuar dialogun, shtyp ESC për të anuluar dialogun.  Kur një dialog ka më shumë fletë, lista e fletëve mund të hapet përmes ALT+F10 ose përmes TAB si pjesë e radhitjes së fletëve të dialogut. Me listën e fokusuar të fletëve,kalo tek fleta paraprake dhe pasuese përmes SHIGJETËS MAJSA ose DJATHTAS.'
		},

			{
			name: 'Menyja Kontestuese e Redaktorit',
			legend: 'Shtyp ${contextMenu} ose APPLICATION KEY për të hapur menynë kontekstuale. Pastaj kalo tek mundësia tjetër e menysë përmes TAB ose SHIGJETËS POSHTË. Kalo tek mundësia paraprake përmes SHIFT+TAB ose SHIGJETA SIPËR. Shtyp SPACE ose ENTER për të përzgjedhur mundësinë e menysë. Hape nënmenynë e mundësisë aktuale përmes tastës HAPËSIRË ose ENTER ose SHIGJETËS DJATHTAS. Kalo prapa tek artikulli i menysë prind përmes ESC ose SHIGJETËS MAJTAS. Mbylle menynë kontekstuale përmes ESC.'
		},

			{
			name: 'Kutiza e Listës së Redaktuesit',
			legend: 'Brenda kutisë së listës, kalo tek artikulli pasues i listës përmes TAB ose SHIGJETËS POSHTË. Kalo tek artikulli paraprak i listës përmes SHIFT+TAB ose SHIGJETËS SIPËR. Shtyp tastën HAPËSIRË ose ENTER për të përzgjedhur mundësitë e listës. Shtyp ESC për të mbyllur kutinë e listës.'
		},

			{
			name: 'Shiriti i Rrugës së Elementeve të Redaktorit',
			legend: 'Shtyp ${elementsPathFocus} për të lëvizur tek shiriti i elementeve. Kalo tek pulla pasuese e elementit përmes TAB ose SHIGJETËS DJATHTAS. Kalo tek pulla paraprake përmes SHIFT+TAB ose SHIGJETËS MAJTAS. Shtyp tastën HAPËSIRË ose ENTER për të përzgjedhur elementin tek redaktuesi.'
		}
		]
	},
		{
		name: 'Komandat',
		items: [
			{
			name: 'Rikthe komandën',
			legend: 'Shtyp ${undo}'
		},
			{
			name: 'Ribëj komandën',
			legend: 'Shtyp ${redo}'
		},
			{
			name: 'Komanda e trashjes së tekstit',
			legend: 'Shtyp ${bold}'
		},
			{
			name: 'Komanda kursive',
			legend: 'Shtyp ${italic}'
		},
			{
			name: 'Komanda e nënvijëzimit',
			legend: 'Shtyp ${underline}'
		},
			{
			name: 'Komanda e Nyjes',
			legend: 'Shtyp ${link}'
		},
			{
			name: 'Komanda e Mbjedhjes së Kokështrirjes',
			legend: 'Shtyp ${toolbarCollapse}'
		},
			{
			name: 'Qasu komandës paraprake të hapësirës së fokusimit',
			legend: 'Shtyp ${accessPreviousSpace} për t\'iu qasur hapësirës më të afërt të paarritshme të fokusimit para simbolit ^, për shembull: dy elemente të afërt  HR. Përsërit kombinacionin e tasteve për të arritur hapësirë të largët fokusimi.'
		},
			{
			name: 'Qasu komandës pasuese të hapësirës së fokusimit',
			legend: 'Shtyp ${accessNextSpace} për t\'iu qasur hapësirës më të afërt të paarritshme të fokusimit pas shenjës ^, për shembull: dy elemente të afërt HR. Përsërit kombinacionin e tasteve për të arritur hapësirën e largët të fokusimit.'
		},
			{
			name: 'Ndihmë Qasjeje',
			legend: 'Shtyp ${a11yHelp}'
		},
			{
			name: 'Hidhe si tekst të thjeshtë',
			legend: 'Shtyp ${pastetext}',
			legendEdge: 'Shtyp ${pastetext}, pasuar nga ${paste}'
		}
		]
	}
	],
	tab: 'Tab',
	pause: 'Pause',
	capslock: 'Caps Lock',
	escape: 'Escape',
	pageUp: 'Faqja sipër',
	pageDown: 'Faqja poshtë',
	leftArrow: 'Shigjeta majtas',
	upArrow: 'Shigjeta sipër',
	rightArrow: 'Shigjeta djathtas',
	downArrow: 'Shigjeta poshtë',
	insert: 'Insert',
	leftWindowKey: 'Pulla Majtas e Windows-it',
	rightWindowKey: 'Pulla Djathtas e Windows-it',
	selectKey: 'Pulla Përzgjedhëse',
	numpad0: 'Numpad 0',
	numpad1: 'Numpad 1',
	numpad2: 'Numpad 2',
	numpad3: 'Numpad 3',
	numpad4: 'Numpad 4',
	numpad5: 'Numpad 5',
	numpad6: 'Numpad 6',
	numpad7: 'Numpad 7',
	numpad8: 'Numpad 8',
	numpad9: 'Numpad 9',
	multiply: 'Shumëzo',
	add: 'Shto',
	subtract: 'Zbrit',
	decimalPoint: 'Pika Decimale',
	divide: 'Pjesëto',
	f1: 'F1',
	f2: 'F2',
	f3: 'F3',
	f4: 'F4',
	f5: 'F5',
	f6: 'F6',
	f7: 'F7',
	f8: 'F8',
	f9: 'F9',
	f10: 'F10',
	f11: 'F11',
	f12: 'F12',
	numLock: 'Num Lock',
	scrollLock: 'Scroll Lock',
	semiColon: 'Pikëpresje',
	equalSign: 'Shenja e Barazimit',
	comma: 'Presje',
	dash: 'minus',
	period: 'Pikë',
	forwardSlash: 'Vija e pjerrët përpara',
	graveAccent: 'Shenja e theksit',
	openBracket: 'Hape kllapën',
	backSlash: 'Vija e pjerrët prapa',
	closeBracket: 'Mbylle kllapën',
	singleQuote: 'Thonjëz e vetme'
} );
